#!/bin/bash

# Complete Audio Integration Script for Norani Qaida
# Utilizes ALL 1,079 audio files from the APK

cd "$(dirname "$0")"

echo "=== COMPLETE AUDIO INTEGRATION - ALL 1,079 FILES ==="

# Create comprehensive directory structure
mkdir -p docs/audio/{letters,combinations,harakat,madd,sukun_shaddah,tanween,advanced,words,exercises,lessons}

# Clear existing files
rm -f docs/audio/*/*.mp3

echo "=== LESSON 1: Individual Letters (L1 series - 30 files) ==="
# All 28 Arabic letters plus variations
cp res/raw/l1alf.mp3 docs/audio/letters/alif.mp3
cp res/raw/l1baa.mp3 docs/audio/letters/baa.mp3
cp res/raw/l1taa.mp3 docs/audio/letters/taa.mp3
cp res/raw/l1sthaa.mp3 docs/audio/letters/thaa.mp3
cp res/raw/l1geem.mp3 docs/audio/letters/jeem.mp3
cp res/raw/l1haa.mp3 docs/audio/letters/haa.mp3
cp res/raw/l15aa.mp3 docs/audio/letters/khaa.mp3
cp res/raw/l1daal.mp3 docs/audio/letters/daal.mp3
cp res/raw/l1zaal.mp3 docs/audio/letters/dhaal.mp3
cp res/raw/l1raa.mp3 docs/audio/letters/raa.mp3
cp res/raw/l1zaa.mp3 docs/audio/letters/zaay.mp3
cp res/raw/l1seen.mp3 docs/audio/letters/seen.mp3
cp res/raw/l1sheen.mp3 docs/audio/letters/sheen.mp3
cp res/raw/l1saad.mp3 docs/audio/letters/saad.mp3
cp res/raw/l1daad.mp3 docs/audio/letters/daad.mp3
cp res/raw/l1ttaa.mp3 docs/audio/letters/taa_emphatic.mp3
cp res/raw/l17aa.mp3 docs/audio/letters/dhaa_emphatic.mp3
cp res/raw/l13aeen.mp3 docs/audio/letters/ayn.mp3
cp res/raw/l1ghaeen.mp3 docs/audio/letters/ghayn.mp3
cp res/raw/l1faa.mp3 docs/audio/letters/faa.mp3
cp res/raw/l1qaaf.mp3 docs/audio/letters/qaaf.mp3
cp res/raw/l1kaaf.mp3 docs/audio/letters/kaaf.mp3
cp res/raw/l1laam.mp3 docs/audio/letters/laam.mp3
cp res/raw/l1meem.mp3 docs/audio/letters/meem.mp3
cp res/raw/l1noon.mp3 docs/audio/letters/noon.mp3
cp res/raw/l1hamza.mp3 docs/audio/letters/haa_soft.mp3
cp res/raw/l1waw.mp3 docs/audio/letters/waaw.mp3
cp res/raw/l1yaa.mp3 docs/audio/letters/yaa.mp3
cp res/raw/l1yaa2.mp3 docs/audio/letters/yaa2.mp3
cp res/raw/l1zzaa.mp3 docs/audio/letters/dhaa_alt.mp3

echo "=== LESSON 2: Letter Combinations (P2 series - 47 files) ==="
# Copy ALL P2 files for comprehensive combinations
cp res/raw/p2_*.mp3 docs/audio/combinations/ 2>/dev/null

echo "=== LESSON 3: More Combinations (P3 series - 54 files) ==="
# Copy ALL P3 files for extended combinations
cp res/raw/p3_*.mp3 docs/audio/combinations/ 2>/dev/null

echo "=== LESSON 4: Basic Exercises (P4 series - 27 files) ==="
# Copy ALL P4 files for basic exercises
cp res/raw/p4_*.mp3 docs/audio/exercises/ 2>/dev/null

echo "=== LESSON 5: Sukun & Advanced (P5 series - 73 files) ==="
# Copy ALL P5 files for sukun and advanced patterns
cp res/raw/p5_*.mp3 docs/audio/sukun_shaddah/ 2>/dev/null

echo "=== LESSON 6: Tanween & Shaddah (P6 series - 77 files) ==="
# Copy ALL P6 files for tanween and shaddah
cp res/raw/p6_*.mp3 docs/audio/tanween/ 2>/dev/null

echo "=== LESSON 7: Complex Patterns (P7 series - 57 files) ==="
# Copy ALL P7 files for complex patterns
cp res/raw/p7_*.mp3 docs/audio/exercises/ 2>/dev/null

echo "=== LESSON 8: Harakat Practice (P8 series - 52 files) ==="
# Copy ALL P8 files for harakat practice
cp res/raw/p8_*.mp3 docs/audio/harakat/ 2>/dev/null

echo "=== LESSON 9: Extended Harakat (P9 series - 64 files) ==="
# Copy ALL P9 files for extended harakat
cp res/raw/p9_*.mp3 docs/audio/harakat/ 2>/dev/null

echo "=== LESSON 10: Long Vowels (P10 series - 70 files) ==="
# Copy ALL P10 files for long vowels
cp res/raw/p10_*.mp3 docs/audio/madd/ 2>/dev/null

echo "=== LESSON 11: Advanced Vowels (P11 series - 50 files) ==="
# Copy ALL P11 files for advanced vowel patterns
cp res/raw/p11_*.mp3 docs/audio/madd/ 2>/dev/null

echo "=== LESSONS 12-23: Word Practice (P12-P23 series - 388 files) ==="
# Copy ALL word files from P12-P23 for comprehensive word practice
for page in {12..23}; do
    echo "Processing Page $page..."
    cp res/raw/p${page}_*.mp3 docs/audio/words/ 2>/dev/null
done

echo "=== SPECIAL FILES ==="
# Copy special files
cp res/raw/basmla.mp3 docs/audio/advanced/bismillah.mp3 2>/dev/null
cp res/raw/lesson1.mp3 docs/audio/lessons/lesson1_title.mp3 2>/dev/null

# Copy any remaining lesson titles
for page in {2..23}; do
    if [ -f "res/raw/p${page}_title.mp3" ]; then
        cp res/raw/p${page}_title.mp3 docs/audio/lessons/lesson${page}_title.mp3
    fi
    if [ -f "res/raw/p${page}_title2.mp3" ]; then
        cp res/raw/p${page}_title2.mp3 docs/audio/lessons/lesson${page}_title2.mp3
    fi
done

echo "=== INTEGRATION COMPLETE! ==="
echo "Audio files organized:"
echo "- Letters: $(ls docs/audio/letters/*.mp3 2>/dev/null | wc -l) files"
echo "- Combinations: $(ls docs/audio/combinations/*.mp3 2>/dev/null | wc -l) files"
echo "- Harakat: $(ls docs/audio/harakat/*.mp3 2>/dev/null | wc -l) files"
echo "- Madd (Long Vowels): $(ls docs/audio/madd/*.mp3 2>/dev/null | wc -l) files"
echo "- Sukun/Shaddah: $(ls docs/audio/sukun_shaddah/*.mp3 2>/dev/null | wc -l) files"
echo "- Tanween: $(ls docs/audio/tanween/*.mp3 2>/dev/null | wc -l) files"
echo "- Words: $(ls docs/audio/words/*.mp3 2>/dev/null | wc -l) files"
echo "- Exercises: $(ls docs/audio/exercises/*.mp3 2>/dev/null | wc -l) files"
echo "- Advanced: $(ls docs/audio/advanced/*.mp3 2>/dev/null | wc -l) files"
echo "- Lessons: $(ls docs/audio/lessons/*.mp3 2>/dev/null | wc -l) files"
echo "TOTAL: $(find docs/audio -name "*.mp3" 2>/dev/null | wc -l) files organized"

echo -e "\n=== VERIFICATION ==="
original_count=$(find res/raw -name "*.mp3" | wc -l)
organized_count=$(find docs/audio -name "*.mp3" | wc -l)
echo "Original APK files: $original_count"
echo "Organized files: $organized_count"
if [ $organized_count -eq $original_count ]; then
    echo "✅ SUCCESS: All audio files have been organized!"
else
    echo "⚠️  WARNING: $(($original_count - $organized_count)) files may be missing"
fi
