#!/usr/bin/env bash
# Builds the no-login web version (GitHub Pages + Firebase) from golf-trip/index.html into docs/.
set -euo pipefail
cd "$(dirname "$0")"
FB=10.12.2
{
  echo '<!doctype html><html lang="en"><head><meta charset="utf-8">'
  echo '<meta name="viewport" content="width=device-width,initial-scale=1,viewport-fit=cover">'
  echo '<style>body{margin:0}img{max-width:100%}[hidden]{display:none!important}</style>'
  echo "<script src=\"https://www.gstatic.com/firebasejs/$FB/firebase-app-compat.js\"></script>"
  echo "<script src=\"https://www.gstatic.com/firebasejs/$FB/firebase-auth-compat.js\"></script>"
  echo "<script src=\"https://www.gstatic.com/firebasejs/$FB/firebase-firestore-compat.js\"></script>"
  echo "<script src=\"https://www.gstatic.com/firebasejs/$FB/firebase-storage-compat.js\"></script>"
  echo '<script src="firebase-config.js"></script>'
  echo '</head><body>'
  cat index.html
  echo '</body></html>'
} > ../docs/index.html
[ -f ../docs/firebase-config.js ] || cat > ../docs/firebase-config.js <<'CFG'
// Paste your Firebase web app config here (Firebase console > Project settings > Your apps).
// These values are not secret; access is controlled by the Firestore rules.
window.GOLF_FIREBASE_CONFIG = null;
CFG
echo "Built ../docs/index.html"
