#!/bin/bash

# Script to organize audio files from APK into proper directory structure
cd "$(dirname "$0")"

echo "Organizing Arabic audio files..."

# Create directories if they don't exist
mkdir -p docs/audio/{letters,combinations,harakat,madd,sukun_shaddah,tanween,advanced}

# Map basic Arabic letters (28 letters)
echo "Copying basic letter sounds..."
cp res/raw/l1alf.mp3 docs/audio/letters/alif.mp3 2>/dev/null || echo "alif.mp3 already exists"
cp res/raw/l1baa.mp3 docs/audio/letters/baa.mp3 2>/dev/null
cp res/raw/l1taa.mp3 docs/audio/letters/taa.mp3 2>/dev/null
cp res/raw/l1sthaa.mp3 docs/audio/letters/thaa.mp3 2>/dev/null
cp res/raw/l1geem.mp3 docs/audio/letters/jeem.mp3 2>/dev/null
cp res/raw/l1haa.mp3 docs/audio/letters/haa.mp3 2>/dev/null
cp res/raw/l15aa.mp3 docs/audio/letters/khaa.mp3 2>/dev/null
cp res/raw/l1daal.mp3 docs/audio/letters/daal.mp3 2>/dev/null
cp res/raw/l1zaal.mp3 docs/audio/letters/dhaal.mp3 2>/dev/null
cp res/raw/l1raa.mp3 docs/audio/letters/raa.mp3 2>/dev/null
cp res/raw/l1zaa.mp3 docs/audio/letters/zaay.mp3 2>/dev/null
cp res/raw/l1seen.mp3 docs/audio/letters/seen.mp3 2>/dev/null
cp res/raw/l1sheen.mp3 docs/audio/letters/sheen.mp3 2>/dev/null
cp res/raw/l1saad.mp3 docs/audio/letters/saad.mp3 2>/dev/null
cp res/raw/l1daad.mp3 docs/audio/letters/daad.mp3 2>/dev/null
cp res/raw/l1ttaa.mp3 docs/audio/letters/taa_emphatic.mp3 2>/dev/null
cp res/raw/l17aa.mp3 docs/audio/letters/dhaa_emphatic.mp3 2>/dev/null
cp res/raw/l13aeen.mp3 docs/audio/letters/ayn.mp3 2>/dev/null
cp res/raw/l1ghaeen.mp3 docs/audio/letters/ghayn.mp3 2>/dev/null
cp res/raw/l1faa.mp3 docs/audio/letters/faa.mp3 2>/dev/null
cp res/raw/l1qaaf.mp3 docs/audio/letters/qaaf.mp3 2>/dev/null
cp res/raw/l1kaaf.mp3 docs/audio/letters/kaaf.mp3 2>/dev/null
cp res/raw/l1laam.mp3 docs/audio/letters/laam.mp3 2>/dev/null
cp res/raw/l1meem.mp3 docs/audio/letters/meem.mp3 2>/dev/null
cp res/raw/l1noon.mp3 docs/audio/letters/noon.mp3 2>/dev/null
cp res/raw/l1hamza.mp3 docs/audio/letters/haa_soft.mp3 2>/dev/null
cp res/raw/l1waw.mp3 docs/audio/letters/waaw.mp3 2>/dev/null
cp res/raw/l1yaa.mp3 docs/audio/letters/yaa.mp3 2>/dev/null

# Map harakat (vowel sounds) - using p8 and p9 series
echo "Copying harakat (vowel) sounds..."
cp res/raw/p8_ba.mp3 docs/audio/harakat/ba_fatha.mp3 2>/dev/null
cp res/raw/p9_be.mp3 docs/audio/harakat/bi_kasra.mp3 2>/dev/null
cp res/raw/p9_bo.mp3 docs/audio/harakat/bu_damma.mp3 2>/dev/null
cp res/raw/p8_ta.mp3 docs/audio/harakat/ta_fatha.mp3 2>/dev/null
cp res/raw/p9_te.mp3 docs/audio/harakat/ti_kasra.mp3 2>/dev/null
cp res/raw/p9_to.mp3 docs/audio/harakat/tu_damma.mp3 2>/dev/null
cp res/raw/p8_tha.mp3 docs/audio/harakat/tha_fatha.mp3 2>/dev/null
cp res/raw/p9_the.mp3 docs/audio/harakat/thi_kasra.mp3 2>/dev/null
cp res/raw/p9_tho.mp3 docs/audio/harakat/thu_damma.mp3 2>/dev/null

# Map combinations - using p2 and p3 series
echo "Copying letter combinations..."
cp res/raw/p2_ba_alf.mp3 docs/audio/combinations/baa_alif.mp3 2>/dev/null
cp res/raw/p2_ta.mp3 docs/audio/combinations/taa_alif.mp3 2>/dev/null
cp res/raw/p2_tha_alf.mp3 docs/audio/combinations/thaa_alif.mp3 2>/dev/null
cp res/raw/p2_lam.mp3 docs/audio/combinations/laam_alif.mp3 2>/dev/null

# Map madd (long vowels) - using longer vowel sounds
echo "Copying madd (long vowel) sounds..."
cp res/raw/p10_bae.mp3 docs/audio/madd/baa_long.mp3 2>/dev/null
cp res/raw/p10_bao.mp3 docs/audio/madd/boo_long.mp3 2>/dev/null
cp res/raw/p9_be.mp3 docs/audio/madd/bee_long.mp3 2>/dev/null

# Map advanced words - using word files
echo "Copying advanced words..."
cp res/raw/basmla.mp3 docs/audio/advanced/bismillah.mp3 2>/dev/null
cp res/raw/p7_word1.mp3 docs/audio/advanced/al_definite.mp3 2>/dev/null
cp res/raw/p8_word1.mp3 docs/audio/advanced/madrasa.mp3 2>/dev/null
cp res/raw/p11_word1.mp3 docs/audio/advanced/kitaab.mp3 2>/dev/null

# Copy some representative tanween sounds
echo "Copying tanween sounds..."
cp res/raw/p6_bn1.mp3 docs/audio/tanween/ban_tanween.mp3 2>/dev/null
cp res/raw/p6_bn2.mp3 docs/audio/tanween/bin_tanween.mp3 2>/dev/null
cp res/raw/p6_bn3.mp3 docs/audio/tanween/bun_tanween.mp3 2>/dev/null

echo "Audio organization complete!"
echo "Files organized into:"
echo "- letters/ (28 Arabic letters)"
echo "- harakat/ (vowel sounds)"
echo "- combinations/ (letter combinations)"
echo "- madd/ (long vowels)"
echo "- tanween/ (nunation sounds)"
echo "- advanced/ (words and phrases)"
