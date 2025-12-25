#!/usr/bin/env python3
import os
import json

# Get all audio files
audio_dir = "audio"
audio_files = []
if os.path.exists(audio_dir):
    audio_files = [f for f in os.listdir(audio_dir) if f.endswith('.mp3')]

print(f"Found {len(audio_files)} audio files")

# Categorize files
l1_files = [f for f in audio_files if f.startswith('l1')]
p_files = {}
for i in range(2, 24):
    p_files[f'p{i}'] = [f for f in audio_files if f.startswith(f'p{i}_')]

title_files = [f for f in audio_files if f.endswith('_title.mp3')]
word_files = [f for f in audio_files if 'word' in f]

print(f"L1 files: {len(l1_files)}")
print(f"Title files: {len(title_files)}")
print(f"Word files: {len(word_files)}")

for i in range(2, 24):
    if p_files[f'p{i}']:
        print(f"P{i} files: {len(p_files[f'p{i}'])}")

# Generate comprehensive lessons structure
lessons_js = """// Comprehensive Norani Lessons Data Structure - Using 800+ Audio Files
const lessons = ["""

# Add all available audio files systematically
total_audio_count = 0

# Basic structure for now - we'll expand this
lessons_js += """
    // ... lessons will be generated here
];

// Export lessons data
if (typeof module !== 'undefined' && module.exports) {
    module.exports = { lessons };
}
"""

print(f"Total audio files that could be used: {len(audio_files)}")
print("Sample files:")
for f in sorted(audio_files)[:20]:
    print(f"  {f}")
