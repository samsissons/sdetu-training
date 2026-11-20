# Golf Trip Leaderboard

A single-page web app for a weekend golf trip: live scoring, handicaps, several game formats, and points standings across the whole trip.

It is published as a claude.ai Artifact with a shared database (`db` capability), so everyone who has the link sees scores update live.

## Formats
- **Stableford**: individual, full handicap, pick-ups allowed
- **Nett Stroke Play**: individual, gross minus handicap
- **Ambrose**: team scramble, team handicap = combined handicaps ÷ (2 × team size)
- **Best Ball Stableford**: pairs, 90% handicap, the better score on each hole counts
- **Skins**: outright lowest nett score on a hole wins it; ties carry over

## Data model (shared db)
- `trip/main`: `{ name, points: [10,8,6,...] }`
- `players/{id}`: `{ name, hcp }`
- `rounds/{id}`: `{ name, course, date, format, status, order, par[18], si[18], teams[], playerIds[], hcp{}, sides[] }`
- `scores/{roundId}__{key}`: `{ roundId, key, holes: { "1": 4, "2": "P", ... } }`. `key` is a player id, or a team id for Ambrose.

Open `index.html` outside claude.ai and it runs a local sample trip with made-up players.

## No-login web version (GitHub Pages + Firebase)
`docs/` holds a version anyone can open without an account. Rebuild it with `golf-trip/build-web.sh` after changing `golf-trip/index.html`.

1. Create a free Firebase project. Add a Web app and paste its config into `docs/firebase-config.js` as `window.GOLF_FIREBASE_CONFIG = {...}`.
2. In Firebase: Authentication > Sign-in method > enable **Anonymous**. Firestore Database > create database, then paste `docs/firestore.rules` into the Rules tab and publish.
3. GitHub repo Settings > Pages: deploy from this branch, folder `/docs`.

Setup is locked with an organiser PIN chosen on first use. Anyone with the link can enter scores.
