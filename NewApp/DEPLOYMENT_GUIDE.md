# Norani App - GitHub Pages Deployment Guide

This guide will help you deploy the Norani web application to GitHub Pages.

## 📋 Prerequisites

- Git installed on your system
- GitHub account
- Access to the Norani NewApp repository

## 🎯 Quick Deployment (Recommended)

The web application has been created in the `docs/` folder and is ready for GitHub Pages deployment. The core files (HTML, CSS, JS) are already in place.

### Step 1: Verify File Structure

The following files should exist in `docs/`:
- ✅ `index.html` - Main application page
- ✅ `styles.css` - Application styles  
- ✅ `app.js` - Application logic
- ✅ `README.md` - Documentation

### Step 2: Important Note About Assets

The web application references assets from the Android project structure:
- **JSON configurations**: `../app/src/main/assets/pages/page*.json`
- **Images**: `../app/src/main/res/drawable/*.png`
- **Audio files**: `../app/src/main/res/raw/*.mp3`

These assets are already in your repository from the Android project. The web app will access them via relative paths.

### Step 3: Enable GitHub Pages

1. **Push your changes** (if you haven't already):
   ```bash
   cd /home/i826753/git/jmasalma/Norani/NewApp
   git add docs/
   git add DEPLOYMENT_GUIDE.md
   git commit -m "Add web version for GitHub Pages"
   git push origin main
   ```

2. **Enable GitHub Pages on GitHub.com**:
   - Go to your repository: `https://github.com/jmasalma/Norani`
   - Click **Settings** (top right)
   - Scroll down to **Pages** section (left sidebar)
   - Under **Source**:
     - Branch: Select `main` (or `master`)
     - Folder: Select `/docs`
   - Click **Save**

3. **Wait for deployment** (usually 1-2 minutes):
   - GitHub will show: "Your site is ready to be published at `https://jmasalma.github.io/Norani/`"
   - When complete, it will show: "Your site is published at `https://jmasalma.github.io/Norani/`"

4. **Access your site**:
   - Visit: `https://jmasalma.github.io/Norani/`
   - Or: `https://jmasalma.github.io/Norani/NewApp/docs/` (depending on repo structure)

## 🔧 Advanced Configuration

### Custom Domain (Optional)

If you want to use a custom domain:

1. In your repository settings → Pages
2. Enter your custom domain (e.g., `norani.example.com`)
3. Add a `CNAME` file in the `docs/` folder:
   ```bash
   echo "norani.example.com" > docs/CNAME
   ```
4. Configure DNS with your domain provider:
   - Add a CNAME record pointing to `jmasalma.github.io`

### Alternative: Deploy to Root

If you prefer to deploy from the repository root instead of `/docs`:

1. Move contents from `docs/` to root:
   ```bash
   cd /home/i826753/git/jmasalma/Norani/NewApp
   mv docs/index.html .
   mv docs/styles.css .
   mv docs/app.js .
   ```

2. Update asset paths in `app.js`:
   - Change `../app/src/` to `app/src/`

3. In GitHub Pages settings:
   - Select `/ (root)` instead of `/docs`

## 🧪 Testing Locally Before Deployment

Before pushing to GitHub, test the application locally:

### Method 1: Python HTTP Server
```bash
cd /home/i826753/git/jmasalma/Norani/NewApp/docs
python3 -m http.server 8000
```
Then visit: `http://localhost:8000`

### Method 2: Node.js HTTP Server
```bash
cd /home/i826753/git/jmasalma/Norani/NewApp/docs
npx http-server -p 8000
```

### Method 3: VS Code Live Server
1. Install "Live Server" extension in VS Code
2. Right-click `docs/index.html`
3. Select "Open with Live Server"

## 📁 Repository Structure

Your repository should look like this:

```
Norani/
├── NewApp/
│   ├── app/
│   │   └── src/
│   │       └── main/
│   │           ├── assets/
│   │           │   └── pages/         # JSON configs (24 files)
│   │           └── res/
│   │               ├── drawable/      # Images (~1000+ PNG files)
│   │               └── raw/          # Audio (~500+ MP3 files)
│   ├── docs/                          # GitHub Pages folder
│   │   ├── index.html
│   │   ├── styles.css
│   │   ├── app.js
│   │   └── README.md
│   ├── DEPLOYMENT_GUIDE.md           # This file
│   └── README.md                     # Android app README
└── (other Android project files)
```

## ⚠️ Important Notes

### File Size Considerations

GitHub has repository size limits:
- **Maximum file size**: 100 MB
- **Repository warning**: 1 GB
- **Repository limit**: Soft limit around 5 GB

If your assets (images + audio) exceed these limits:

**Option 1: Use Git LFS (Large File Storage)**
```bash
git lfs install
git lfs track "*.png"
git lfs track "*.mp3"
git add .gitattributes
git commit -m "Add Git LFS tracking"
```

**Option 2: Host assets externally**
- Use a CDN or external storage (AWS S3, Cloudflare R2, etc.)
- Update paths in `app.js` to point to external URLs

**Option 3: Optimize assets**
```bash
# Compress images (requires imagemagick)
find app/src/main/res/drawable -name "*.png" -exec convert {} -quality 85 {} \;

# Compress audio (requires ffmpeg)
find app/src/main/res/raw -name "*.mp3" -exec ffmpeg -i {} -b:a 96k {}.new.mp3 \;
```

### HTTPS Requirement

GitHub Pages serves content over HTTPS by default. This is required for:
- Audio autoplay in browsers
- Microphone access (if you add it later)
- Modern web APIs

### Cross-Origin Resource Sharing (CORS)

If you move assets to external hosting, ensure CORS headers allow access from your GitHub Pages domain.

## 🐛 Troubleshooting

### Issue: "404 - File not found"
- Verify files are in the correct location
- Check that the branch and folder are correctly set in GitHub Pages settings
- Wait a few minutes for changes to propagate

### Issue: Assets not loading
- Check browser console (F12) for specific errors
- Verify relative paths in `app.js` are correct
- Ensure asset files were pushed to GitHub

### Issue: Audio not playing
- Some browsers block autoplay; user interaction is required first
- Check that MP3 files are valid and not corrupted
- Verify file paths match the filenames in your repository

### Issue: Page shows old content
- Clear browser cache (Ctrl+Shift+R or Cmd+Shift+R)
- Wait for GitHub Pages to rebuild (can take 1-2 minutes)
- Check deployment status in repository Actions tab

## 🔄 Updating the Site

To update the site after making changes:

```bash
cd /home/i826753/git/jmasalma/Norani/NewApp

# Make your changes to files in docs/

# Stage and commit changes
git add docs/
git commit -m "Update web application"

# Push to GitHub
git push origin main

# GitHub Pages will automatically rebuild (1-2 minutes)
```

## 📊 Monitoring

### Check Deployment Status
- Go to repository → Actions tab
- See GitHub Pages deployment progress
- View build logs if there are errors

### Analytics (Optional)
Add Google Analytics or similar to track usage:

1. Get your tracking ID from Google Analytics
2. Add tracking code to `docs/index.html` before `</head>`:
```html
<script async src="https://www.googletagmanager.com/gtag/js?id=YOUR-ID"></script>
<script>
  window.dataLayer = window.dataLayer || [];
  function gtag(){dataLayer.push(arguments);}
  gtag('js', new Date());
  gtag('config', 'YOUR-ID');
</script>
```

## ✅ Deployment Checklist

Before going live, verify:

- [ ] All files committed and pushed to GitHub
- [ ] GitHub Pages enabled in repository settings
- [ ] Correct branch and folder selected
- [ ] Site accessible at GitHub Pages URL
- [ ] All pages (0-23) load correctly
- [ ] Images display properly
- [ ] Audio plays when clicking items
- [ ] Navigation buttons work
- [ ] Page selector functions correctly
- [ ] Help dialogs appear when available
- [ ] Responsive design works on mobile
- [ ] No console errors in browser

## 📞 Support

If you encounter issues:

1. Check the browser console (F12) for errors
2. Review the `docs/README.md` for troubleshooting tips
3. Verify all prerequisites are met
4. Check GitHub Pages status: https://www.githubstatus.com/

## 🎉 Success!

Once deployed, your Norani app will be accessible to anyone with the URL. Share it with students and teachers!

**Example URL**: `https://jmasalma.github.io/Norani/`

---

**Note**: The first deployment may take a few minutes. Subsequent updates are usually faster.
