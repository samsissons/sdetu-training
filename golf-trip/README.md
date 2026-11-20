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
