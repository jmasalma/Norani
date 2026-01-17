#!/bin/bash

# Comprehensive Audio Mapping Script for Norani Qaida
# Based on analysis of 1,079 audio files from the APK

cd "$(dirname "$0")"

echo "Creating comprehensive audio mapping from APK files..."

# Create directories
mkdir -p docs/audio/{letters,combinations,harakat,madd,sukun_shaddah,tanween,advanced}

# Clear existing files
rm -f docs/audio/letters/*.mp3
rm -f docs/audio/combinations/*.mp3
rm -f docs/audio/harakat/*.mp3
rm -f docs/audio/madd/*.mp3
rm -f docs/audio/sukun_shaddah/*.mp3
rm -f docs/audio/tanween/*.mp3
rm -f docs/audio/advanced/*.mp3

echo "=== LESSON 1: Individual Letters (L1 series) ==="
# Map all 28 Arabic letters from L1 series
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

echo "=== LESSON 2: Letter Combinations (P2 series) ==="
# Map letter combinations from P2 series
cp res/raw/p2_ba_alf.mp3 docs/audio/combinations/baa_alif.mp3
cp res/raw/p2_ta.mp3 docs/audio/combinations/taa_alif.mp3
cp res/raw/p2_tha_alf.mp3 docs/audio/combinations/thaa_alif.mp3
cp res/raw/p2_l_alf.mp3 docs/audio/combinations/laam_alif.mp3
cp res/raw/p2_ba_gem.mp3 docs/audio/combinations/baa_jeem.mp3
cp res/raw/p2_ba_mem.mp3 docs/audio/combinations/baa_meem.mp3
cp res/raw/p2_ba_seen.mp3 docs/audio/combinations/baa_seen.mp3
cp res/raw/p2_ba_ya.mp3 docs/audio/combinations/baa_yaa.mp3

echo "=== LESSON 3: Harakat - Short Vowels (P8 & P9 series) ==="
# Map harakat from P8 (fatha) and P9 (kasra/damma) series
cp res/raw/p8_ba.mp3 docs/audio/harakat/ba_fatha.mp3
cp res/raw/p9_be.mp3 docs/audio/harakat/bi_kasra.mp3
cp res/raw/p9_bo.mp3 docs/audio/harakat/bu_damma.mp3
cp res/raw/p8_ta.mp3 docs/audio/harakat/ta_fatha.mp3
cp res/raw/p9_te.mp3 docs/audio/harakat/ti_kasra.mp3
cp res/raw/p9_to.mp3 docs/audio/harakat/tu_damma.mp3
cp res/raw/p8_tha.mp3 docs/audio/harakat/tha_fatha.mp3
cp res/raw/p9_the.mp3 docs/audio/harakat/thi_kasra.mp3
cp res/raw/p9_tho.mp3 docs/audio/harakat/thu_damma.mp3
cp res/raw/p8_ga.mp3 docs/audio/harakat/ja_fatha.mp3
cp res/raw/p9_ge.mp3 docs/audio/harakat/ji_kasra.mp3
cp res/raw/p9_go.mp3 docs/audio/harakat/ju_damma.mp3
cp res/raw/p8_ha.mp3 docs/audio/harakat/ha_fatha.mp3
cp res/raw/p8_he.mp3 docs/audio/harakat/hi_kasra.mp3
cp res/raw/p8_ho.mp3 docs/audio/harakat/hu_damma.mp3
cp res/raw/p8_5a.mp3 docs/audio/harakat/kha_fatha.mp3
cp res/raw/p9_5e.mp3 docs/audio/harakat/khi_kasra.mp3
cp res/raw/p9_5o.mp3 docs/audio/harakat/khu_damma.mp3
cp res/raw/p8_sa.mp3 docs/audio/harakat/sa_fatha.mp3
cp res/raw/p9_se.mp3 docs/audio/harakat/si_kasra.mp3
cp res/raw/p9_so.mp3 docs/audio/harakat/su_damma.mp3
cp res/raw/p8_sha.mp3 docs/audio/harakat/sha_fatha.mp3
cp res/raw/p9_she.mp3 docs/audio/harakat/shi_kasra.mp3
cp res/raw/p9_sho.mp3 docs/audio/harakat/shu_damma.mp3

echo "=== LESSON 4: Long Vowels - Madd (P10 series) ==="
# Map long vowels from P10 series
cp res/raw/p10_bae.mp3 docs/audio/madd/baa_long.mp3
cp res/raw/p10_bao.mp3 docs/audio/madd/boo_long.mp3
cp res/raw/p9_be.mp3 docs/audio/madd/bee_long.mp3
cp res/raw/p10_tae.mp3 docs/audio/madd/taa_long.mp3
cp res/raw/p10_tao.mp3 docs/audio/madd/too_long.mp3
cp res/raw/p9_te.mp3 docs/audio/madd/tee_long.mp3
cp res/raw/p10_thae.mp3 docs/audio/madd/thaa_long.mp3
cp res/raw/p10_thao.mp3 docs/audio/madd/thoo_long.mp3
cp res/raw/p9_the.mp3 docs/audio/madd/thee_long.mp3

echo "=== LESSON 5: Sukun & Shaddah (P5 & P6 series) ==="
# Map sukun and shaddah from P5 and P6 series
cp res/raw/p5_b1.mp3 docs/audio/sukun_shaddah/b_sukun.mp3
cp res/raw/p6_bn1.mp3 docs/audio/sukun_shaddah/bba_shaddah.mp3
cp res/raw/p5_t1.mp3 docs/audio/sukun_shaddah/t_sukun.mp3
cp res/raw/p6_bn2.mp3 docs/audio/sukun_shaddah/tta_shaddah.mp3
cp res/raw/p5_tha1.mp3 docs/audio/sukun_shaddah/th_sukun.mp3
cp res/raw/p6_bn3.mp3 docs/audio/sukun_shaddah/ththa_shaddah.mp3

echo "=== LESSON 6: Tanween (P6 series) ==="
# Map tanween from P6 series
cp res/raw/p6_bn1.mp3 docs/audio/tanween/ban_tanween.mp3
cp res/raw/p6_bn2.mp3 docs/audio/tanween/bin_tanween.mp3
cp res/raw/p6_bn3.mp3 docs/audio/tanween/bun_tanween.mp3
cp res/raw/p6_fn1.mp3 docs/audio/tanween/fan_tanween.mp3
cp res/raw/p6_fn2.mp3 docs/audio/tanween/fin_tanween.mp3
cp res/raw/p6_fn3.mp3 docs/audio/tanween/fun_tanween.mp3
cp res/raw/p6_mn1.mp3 docs/audio/tanween/man_tanween.mp3
cp res/raw/p6_mn2.mp3 docs/audio/tanween/min_tanween.mp3
cp res/raw/p6_mn3.mp3 docs/audio/tanween/mun_tanween.mp3

echo "=== LESSON 7: Advanced Words (Word series) ==="
# Map advanced words from various word series
cp res/raw/basmla.mp3 docs/audio/advanced/bismillah.mp3
cp res/raw/p7_word1.mp3 docs/audio/advanced/word1.mp3
cp res/raw/p7_word2.mp3 docs/audio/advanced/word2.mp3
cp res/raw/p7_word3.mp3 docs/audio/advanced/word3.mp3
cp res/raw/p8_word1.mp3 docs/audio/advanced/madrasa.mp3
cp res/raw/p11_word1.mp3 docs/audio/advanced/kitaab.mp3
cp res/raw/p12_word1.mp3 docs/audio/advanced/muallim.mp3
cp res/raw/p13_word1.mp3 docs/audio/advanced/taalib.mp3

# Copy lesson titles for reference
cp res/raw/lesson1.mp3 docs/audio/advanced/lesson1_title.mp3
cp res/raw/p2_title.mp3 docs/audio/advanced/lesson2_title.mp3 2>/dev/null
cp res/raw/p5_title.mp3 docs/audio/advanced/lesson5_title.mp3 2>/dev/null
cp res/raw/p6_title.mp3 docs/audio/advanced/lesson6_title.mp3 2>/dev/null
cp res/raw/p7_title.mp3 docs/audio/advanced/lesson7_title.mp3 2>/dev/null
cp res/raw/p8_title.mp3 docs/audio/advanced/lesson8_title.mp3 2>/dev/null

echo "=== Audio Mapping Complete! ==="
echo "Mapped audio files:"
echo "- Letters: $(ls docs/audio/letters/*.mp3 2>/dev/null | wc -l) files"
echo "- Combinations: $(ls docs/audio/combinations/*.mp3 2>/dev/null | wc -l) files"
echo "- Harakat: $(ls docs/audio/harakat/*.mp3 2>/dev/null | wc -l) files"
echo "- Madd: $(ls docs/audio/madd/*.mp3 2>/dev/null | wc -l) files"
echo "- Sukun/Shaddah: $(ls docs/audio/sukun_shaddah/*.mp3 2>/dev/null | wc -l) files"
echo "- Tanween: $(ls docs/audio/tanween/*.mp3 2>/dev/null | wc -l) files"
echo "- Advanced: $(ls docs/audio/advanced/*.mp3 2>/dev/null | wc -l) files"
echo "Total: $(find docs/audio -name "*.mp3" 2>/dev/null | wc -l) files organized"
