// Fixed Norani Qaida Flashcards - Proper Audio-Content Mapping
const flashcardsData = {
    1: {
        title: "Lesson 1: Individual Letters (الحروف المفردة)",
        description: "Learn the 28 Arabic letters with authentic pronunciation",
        cards: [
            {
                arabic: "ا",
                transliteration: "Alif",
                pronunciation: "aa",
                explanation: "Arabic letter Alif - makes 'aa' sound",
                hint: "straight line",
                audio: "audio/letters/alif.mp3"
            },
            {
                arabic: "ع",
                transliteration: "Ayn",
                pronunciation: "'a",
                explanation: "Arabic letter Ayn - makes ''a' sound",
                hint: "curved opening",
                audio: "audio/letters/ayn.mp3"
            },
            {
                arabic: "ب",
                transliteration: "Baa",
                pronunciation: "b",
                explanation: "Arabic letter Baa - makes 'b' sound",
                hint: "one dot below",
                audio: "audio/letters/baa.mp3"
            },
            {
                arabic: "ض",
                transliteration: "Daad",
                pronunciation: "d",
                explanation: "Arabic letter Daad - makes 'd' sound",
                hint: "one dot above",
                audio: "audio/letters/daad.mp3"
            },
            {
                arabic: "د",
                transliteration: "Daal",
                pronunciation: "d",
                explanation: "Arabic letter Daal - makes 'd' sound",
                hint: "curved at top",
                audio: "audio/letters/daal.mp3"
            },
            {
                arabic: "ذ",
                transliteration: "Dhaal",
                pronunciation: "dh",
                explanation: "Arabic letter Dhaal - makes 'dh' sound",
                hint: "alternative form",
                audio: "audio/letters/dhaa_alt.mp3"
            },
            {
                arabic: "ظ",
                transliteration: "Dhaa",
                pronunciation: "dh",
                explanation: "Arabic letter Dhaa - makes 'dh' sound",
                hint: "emphatic one dot",
                audio: "audio/letters/dhaa_emphatic.mp3"
            },
            {
                arabic: "ذ",
                transliteration: "Dhaal",
                pronunciation: "dh",
                explanation: "Arabic letter Dhaal - makes 'dh' sound",
                hint: "one dot above",
                audio: "audio/letters/dhaal.mp3"
            },
            {
                arabic: "ف",
                transliteration: "Faa",
                pronunciation: "f",
                explanation: "Arabic letter Faa - makes 'f' sound",
                hint: "one dot above",
                audio: "audio/letters/faa.mp3"
            },
            {
                arabic: "غ",
                transliteration: "Ghayn",
                pronunciation: "gh",
                explanation: "Arabic letter Ghayn - makes 'gh' sound",
                hint: "one dot above",
                audio: "audio/letters/ghayn.mp3"
            },
            {
                arabic: "ح",
                transliteration: "Haa",
                pronunciation: "h",
                explanation: "Arabic letter Haa - makes 'h' sound",
                hint: "no dots curved",
                audio: "audio/letters/haa.mp3"
            },
            {
                arabic: "ه",
                transliteration: "Haa",
                pronunciation: "h",
                explanation: "Arabic letter Haa - makes 'h' sound",
                hint: "oval shape",
                audio: "audio/letters/haa_soft.mp3"
            },
            {
                arabic: "ج",
                transliteration: "Jeem",
                pronunciation: "j",
                explanation: "Arabic letter Jeem - makes 'j' sound",
                hint: "one dot below",
                audio: "audio/letters/jeem.mp3"
            },
            {
                arabic: "ك",
                transliteration: "Kaaf",
                pronunciation: "k",
                explanation: "Arabic letter Kaaf - makes 'k' sound",
                hint: "small tooth",
                audio: "audio/letters/kaaf.mp3"
            },
            {
                arabic: "خ",
                transliteration: "Khaa",
                pronunciation: "kh",
                explanation: "Arabic letter Khaa - makes 'kh' sound",
                hint: "one dot above",
                audio: "audio/letters/khaa.mp3"
            },
            {
                arabic: "ل",
                transliteration: "Laam",
                pronunciation: "l",
                explanation: "Arabic letter Laam - makes 'l' sound",
                hint: "tall curved",
                audio: "audio/letters/laam.mp3"
            },
            {
                arabic: "م",
                transliteration: "Meem",
                pronunciation: "m",
                explanation: "Arabic letter Meem - makes 'm' sound",
                hint: "circular shape",
                audio: "audio/letters/meem.mp3"
            },
            {
                arabic: "ن",
                transliteration: "Noon",
                pronunciation: "n",
                explanation: "Arabic letter Noon - makes 'n' sound",
                hint: "one dot above",
                audio: "audio/letters/noon.mp3"
            },
            {
                arabic: "ق",
                transliteration: "Qaaf",
                pronunciation: "q",
                explanation: "Arabic letter Qaaf - makes 'q' sound",
                hint: "two dots above",
                audio: "audio/letters/qaaf.mp3"
            },
            {
                arabic: "ر",
                transliteration: "Raa",
                pronunciation: "r",
                explanation: "Arabic letter Raa - makes 'r' sound",
                hint: "curved hook",
                audio: "audio/letters/raa.mp3"
            },
            {
                arabic: "ص",
                transliteration: "Saad",
                pronunciation: "s",
                explanation: "Arabic letter Saad - makes 's' sound",
                hint: "curved no dots",
                audio: "audio/letters/saad.mp3"
            },
            {
                arabic: "س",
                transliteration: "Seen",
                pronunciation: "s",
                explanation: "Arabic letter Seen - makes 's' sound",
                hint: "three teeth",
                audio: "audio/letters/seen.mp3"
            },
            {
                arabic: "ش",
                transliteration: "Sheen",
                pronunciation: "sh",
                explanation: "Arabic letter Sheen - makes 'sh' sound",
                hint: "three dots above",
                audio: "audio/letters/sheen.mp3"
            },
            {
                arabic: "ط",
                transliteration: "Taa",
                pronunciation: "t",
                explanation: "Arabic letter Taa - makes 't' sound",
                hint: "emphatic curved",
                audio: "audio/letters/taa_emphatic.mp3"
            },
            {
                arabic: "ت",
                transliteration: "Taa",
                pronunciation: "t",
                explanation: "Arabic letter Taa - makes 't' sound",
                hint: "two dots above",
                audio: "audio/letters/taa.mp3"
            },
            {
                arabic: "ث",
                transliteration: "Thaa",
                pronunciation: "th",
                explanation: "Arabic letter Thaa - makes 'th' sound",
                hint: "three dots above",
                audio: "audio/letters/thaa.mp3"
            },
            {
                arabic: "و",
                transliteration: "Waaw",
                pronunciation: "w/oo",
                explanation: "Arabic letter Waaw - makes 'w/oo' sound",
                hint: "curved hook",
                audio: "audio/letters/waaw.mp3"
            },
            {
                arabic: "ي",
                transliteration: "Yaa",
                pronunciation: "y/ee",
                explanation: "Arabic letter Yaa - makes 'y/ee' sound",
                hint: "alternative form",
                audio: "audio/letters/yaa2.mp3"
            },
            {
                arabic: "ي",
                transliteration: "Yaa",
                pronunciation: "y/ee",
                explanation: "Arabic letter Yaa - makes 'y/ee' sound",
                hint: "two dots below",
                audio: "audio/letters/yaa.mp3"
            },
            {
                arabic: "ز",
                transliteration: "Zaay",
                pronunciation: "z",
                explanation: "Arabic letter Zaay - makes 'z' sound",
                hint: "one dot above",
                audio: "audio/letters/zaay.mp3"
            },
        ]
    },
    2: {
        title: "Lesson 2: Basic Letter Combinations (P2 Series)",
        description: "Learn how letters connect together - 47 combinations",
        cards: [
            {
                arabic: "ا",
                transliteration: "alf",
                pronunciation: "alf",
                explanation: "Letter combination: alif alone",
                hint: "P2 combination",
                audio: "audio/combinations/p2_alf.mp3"
            },
            {
                arabic: "با",
                transliteration: "ba alf",
                pronunciation: "ba alf",
                explanation: "Letter combination: baa + alif",
                hint: "P2 combination",
                audio: "audio/combinations/p2_ba_alf.mp3"
            },
            {
                arabic: "بج",
                transliteration: "ba jeem",
                pronunciation: "ba jeem",
                explanation: "Letter combination: baa + jeem",
                hint: "P2 combination",
                audio: "audio/combinations/p2_ba_gem.mp3"
            },
            {
                arabic: "بم",
                transliteration: "ba meem",
                pronunciation: "ba meem",
                explanation: "Letter combination: baa + meem",
                hint: "P2 combination",
                audio: "audio/combinations/p2_ba_mem.mp3"
            },
            {
                arabic: "ب",
                transliteration: "ba",
                pronunciation: "ba",
                explanation: "Letter combination: baa alone",
                hint: "P2 combination",
                audio: "audio/combinations/p2_ba.mp3"
            },
            {
                arabic: "بس",
                transliteration: "ba seen",
                pronunciation: "ba seen",
                explanation: "Letter combination: baa + seen",
                hint: "P2 combination",
                audio: "audio/combinations/p2_ba_seen.mp3"
            },
            {
                arabic: "بي",
                transliteration: "ba yaa",
                pronunciation: "ba yaa",
                explanation: "Letter combination: baa + yaa",
                hint: "P2 combination",
                audio: "audio/combinations/p2_ba_ya.mp3"
            },
            {
                arabic: "بكت",
                transliteration: "bakat",
                pronunciation: "bakat",
                explanation: "Letter combination: baa + kaaf + taa",
                hint: "P2 combination",
                audio: "audio/combinations/p2_bkt.mp3"
            },
            {
                arabic: "بلب",
                transliteration: "balab",
                pronunciation: "balab",
                explanation: "Letter combination: baa + laam + baa",
                hint: "P2 combination",
                audio: "audio/combinations/p2_blb.mp3"
            },
            {
                arabic: "بيل",
                transliteration: "bayal",
                pronunciation: "bayal",
                explanation: "Letter combination: baa + yaa + laam",
                hint: "P2 combination",
                audio: "audio/combinations/p2_byl.mp3"
            },
            {
                arabic: "كاف",
                transliteration: "kaaf",
                pronunciation: "kaaf",
                explanation: "Letter combination: kaaf letter",
                hint: "P2 combination",
                audio: "audio/combinations/p2_kaf.mp3"
            },
            {
                arabic: "كا",
                transliteration: "ka alf",
                pronunciation: "ka alf",
                explanation: "Letter combination: kaaf + alif",
                hint: "P2 combination",
                audio: "audio/combinations/p2_k_alf.mp3"
            },
            {
                arabic: "كب",
                transliteration: "kab",
                pronunciation: "kab",
                explanation: "Letter combination: kaaf + baa",
                hint: "P2 combination",
                audio: "audio/combinations/p2_kb.mp3"
            },
            {
                arabic: "لا",
                transliteration: "laa",
                pronunciation: "laa",
                explanation: "Letter combination: laam + alif special",
                hint: "P2 combination",
                audio: "audio/combinations/p2_l_alf.mp3"
            },
            {
                arabic: "لح",
                transliteration: "lam haa",
                pronunciation: "lam haa",
                explanation: "Letter combination: laam + haa",
                hint: "P2 combination",
                audio: "audio/combinations/p2_lam_7a.mp3"
            },
            {
                arabic: "لام",
                transliteration: "laam",
                pronunciation: "laam",
                explanation: "Letter combination: laam letter",
                hint: "P2 combination",
                audio: "audio/combinations/p2_lam.mp3"
            },
            {
                arabic: "نخ",
                transliteration: "na khaa",
                pronunciation: "na khaa",
                explanation: "Letter combination: noon + khaa",
                hint: "P2 combination",
                audio: "audio/combinations/p2_n_5a.mp3"
            },
            {
                arabic: "نا",
                transliteration: "na alf",
                pronunciation: "na alf",
                explanation: "Letter combination: noon + alif",
                hint: "P2 combination",
                audio: "audio/combinations/p2_n_alf.mp3"
            },
            {
                arabic: "نبل",
                transliteration: "nabal",
                pronunciation: "nabal",
                explanation: "Letter combination: noon + baa + laam",
                hint: "P2 combination",
                audio: "audio/combinations/p2_nbl.mp3"
            },
            {
                arabic: "نبن",
                transliteration: "naban",
                pronunciation: "naban",
                explanation: "Letter combination: noon + baa + noon",
                hint: "P2 combination",
                audio: "audio/combinations/p2_nbn.mp3"
            },
            {
                arabic: "تركيب",
                transliteration: "n + mem",
                pronunciation: "n + mem",
                explanation: "Letter combination: n + mem",
                hint: "P2 pattern",
                audio: "audio/combinations/p2_n_mem.mp3"
            },
            {
                arabic: "تركيب",
                transliteration: "non",
                pronunciation: "non",
                explanation: "Letter combination: non",
                hint: "P2 pattern",
                audio: "audio/combinations/p2_non.mp3"
            },
            {
                arabic: "تركيب",
                transliteration: "n + seen",
                pronunciation: "n + seen",
                explanation: "Letter combination: n + seen",
                hint: "P2 pattern",
                audio: "audio/combinations/p2_n_seen.mp3"
            },
            {
                arabic: "تركيب",
                transliteration: "n + ya",
                pronunciation: "n + ya",
                explanation: "Letter combination: n + ya",
                hint: "P2 pattern",
                audio: "audio/combinations/p2_n_ya.mp3"
            },
            {
                arabic: "تركيب",
                transliteration: "t + 7a",
                pronunciation: "t + 7a",
                explanation: "Letter combination: t + 7a",
                hint: "P2 pattern",
                audio: "audio/combinations/p2_t_7a.mp3"
            },
            {
                arabic: "تركيب",
                transliteration: "t + alf",
                pronunciation: "t + alf",
                explanation: "Letter combination: t + alf",
                hint: "P2 pattern",
                audio: "audio/combinations/p2_t_alf.mp3"
            },
            {
                arabic: "تركيب",
                transliteration: "ta + mem",
                pronunciation: "ta + mem",
                explanation: "Letter combination: ta + mem",
                hint: "P2 pattern",
                audio: "audio/combinations/p2_ta_mem.mp3"
            },
            {
                arabic: "تركيب",
                transliteration: "ta",
                pronunciation: "ta",
                explanation: "Letter combination: ta",
                hint: "P2 pattern",
                audio: "audio/combinations/p2_ta.mp3"
            },
            {
                arabic: "تركيب",
                transliteration: "ta + seen",
                pronunciation: "ta + seen",
                explanation: "Letter combination: ta + seen",
                hint: "P2 pattern",
                audio: "audio/combinations/p2_ta_seen.mp3"
            },
            {
                arabic: "تركيب",
                transliteration: "ta + ya",
                pronunciation: "ta + ya",
                explanation: "Letter combination: ta + ya",
                hint: "P2 pattern",
                audio: "audio/combinations/p2_ta_ya.mp3"
            },
            {
                arabic: "تركيب",
                transliteration: "tha + 2 + l",
                pronunciation: "tha + 2 + l",
                explanation: "Letter combination: tha + 2 + l",
                hint: "P2 pattern",
                audio: "audio/combinations/p2_tha_2_l.mp3"
            },
            {
                arabic: "تركيب",
                transliteration: "tha + alf",
                pronunciation: "tha + alf",
                explanation: "Letter combination: tha + alf",
                hint: "P2 pattern",
                audio: "audio/combinations/p2_tha_alf.mp3"
            },
            {
                arabic: "تركيب",
                transliteration: "tha + gem",
                pronunciation: "tha + gem",
                explanation: "Letter combination: tha + gem",
                hint: "P2 pattern",
                audio: "audio/combinations/p2_tha_gem.mp3"
            },
            {
                arabic: "تركيب",
                transliteration: "tha + mem",
                pronunciation: "tha + mem",
                explanation: "Letter combination: tha + mem",
                hint: "P2 pattern",
                audio: "audio/combinations/p2_tha_mem.mp3"
            },
            {
                arabic: "تركيب",
                transliteration: "tha",
                pronunciation: "tha",
                explanation: "Letter combination: tha",
                hint: "P2 pattern",
                audio: "audio/combinations/p2_tha.mp3"
            },
            {
                arabic: "تركيب",
                transliteration: "tha + seen",
                pronunciation: "tha + seen",
                explanation: "Letter combination: tha + seen",
                hint: "P2 pattern",
                audio: "audio/combinations/p2_tha_seen.mp3"
            },
            {
                arabic: "تركيب",
                transliteration: "tha + ya",
                pronunciation: "tha + ya",
                explanation: "Letter combination: tha + ya",
                hint: "P2 pattern",
                audio: "audio/combinations/p2_tha_ya.mp3"
            },
            {
                arabic: "تركيب",
                transliteration: "title",
                pronunciation: "title",
                explanation: "Letter combination: title",
                hint: "P2 pattern",
                audio: "audio/combinations/p2_title.mp3"
            },
            {
                arabic: "تركيب",
                transliteration: "tks",
                pronunciation: "tks",
                explanation: "Letter combination: tks",
                hint: "P2 pattern",
                audio: "audio/combinations/p2_tks.mp3"
            },
            {
                arabic: "تركيب",
                transliteration: "tnl",
                pronunciation: "tnl",
                explanation: "Letter combination: tnl",
                hint: "P2 pattern",
                audio: "audio/combinations/p2_tnl.mp3"
            },
            {
                arabic: "تركيب",
                transliteration: "ya + 7a",
                pronunciation: "ya + 7a",
                explanation: "Letter combination: ya + 7a",
                hint: "P2 pattern",
                audio: "audio/combinations/p2_ya_7a.mp3"
            },
            {
                arabic: "تركيب",
                transliteration: "ya + alf",
                pronunciation: "ya + alf",
                explanation: "Letter combination: ya + alf",
                hint: "P2 pattern",
                audio: "audio/combinations/p2_ya_alf.mp3"
            },
            {
                arabic: "تركيب",
                transliteration: "ya + mem",
                pronunciation: "ya + mem",
                explanation: "Letter combination: ya + mem",
                hint: "P2 pattern",
                audio: "audio/combinations/p2_ya_mem.mp3"
            },
            {
                arabic: "تركيب",
                transliteration: "ya",
                pronunciation: "ya",
                explanation: "Letter combination: ya",
                hint: "P2 pattern",
                audio: "audio/combinations/p2_ya.mp3"
            },
            {
                arabic: "تركيب",
                transliteration: "ya + seen",
                pronunciation: "ya + seen",
                explanation: "Letter combination: ya + seen",
                hint: "P2 pattern",
                audio: "audio/combinations/p2_ya_seen.mp3"
            },
            {
                arabic: "تركيب",
                transliteration: "ya + ya",
                pronunciation: "ya + ya",
                explanation: "Letter combination: ya + ya",
                hint: "P2 pattern",
                audio: "audio/combinations/p2_ya_ya.mp3"
            },
            {
                arabic: "تركيب",
                transliteration: "ytl",
                pronunciation: "ytl",
                explanation: "Letter combination: ytl",
                hint: "P2 pattern",
                audio: "audio/combinations/p2_ytl.mp3"
            },
        ]
    },
    3: {
        title: "Lesson 3: Extended Combinations (P3 Series)",
        description: "More complex letter combinations - 54 patterns",
        cards: [
            {
                arabic: "تركيب متقدم",
                transliteration: "3en",
                pronunciation: "3en",
                explanation: "Advanced combination: 3en",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_3en.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "3en + za",
                pronunciation: "3en + za",
                explanation: "Advanced combination: 3en + za",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_3en_za.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "5a + ba",
                pronunciation: "5a + ba",
                explanation: "Advanced combination: 5a + ba",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_5a_ba.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "5a",
                pronunciation: "5a",
                explanation: "Advanced combination: 5a",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_5a.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "5a + zal",
                pronunciation: "5a + zal",
                explanation: "Advanced combination: 5a + zal",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_5a_zal.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "5a + za",
                pronunciation: "5a + za",
                explanation: "Advanced combination: 5a + za",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_5a_za.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "7a",
                pronunciation: "7a",
                explanation: "Advanced combination: 7a",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_7a.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "7a + tha",
                pronunciation: "7a + tha",
                explanation: "Advanced combination: 7a + tha",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_7a_tha.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "b + 3en + d",
                pronunciation: "b + 3en + d",
                explanation: "Advanced combination: b + 3en + d",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_b_3en_d.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "b5a + ta",
                pronunciation: "b5a + ta",
                explanation: "Advanced combination: b5a + ta",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_b5a_ta.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "ba + ta",
                pronunciation: "ba + ta",
                explanation: "Advanced combination: ba + ta",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_ba_ta.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "bh + alf",
                pronunciation: "bh + alf",
                explanation: "Advanced combination: bh + alf",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_bh_alf.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "bhm",
                pronunciation: "bhm",
                explanation: "Advanced combination: bhm",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_bhm.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "bnn",
                pronunciation: "bnn",
                explanation: "Advanced combination: bnn",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_bnn.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "dad + alf",
                pronunciation: "dad + alf",
                explanation: "Advanced combination: dad + alf",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_dad_alf.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "dad + ghen",
                pronunciation: "dad + ghen",
                explanation: "Advanced combination: dad + ghen",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_dad_ghen.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "dad",
                pronunciation: "dad",
                explanation: "Advanced combination: dad",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_dad.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "dal",
                pronunciation: "dal",
                explanation: "Advanced combination: dal",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_dal.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "fa",
                pronunciation: "fa",
                explanation: "Advanced combination: fa",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_fa.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "gd",
                pronunciation: "gd",
                explanation: "Advanced combination: gd",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_gd.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "gem",
                pronunciation: "gem",
                explanation: "Advanced combination: gem",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_gem.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "gem + ta",
                pronunciation: "gem + ta",
                explanation: "Advanced combination: gem + ta",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_gem_ta.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "ghen",
                pronunciation: "ghen",
                explanation: "Advanced combination: ghen",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_ghen.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "ghen + ra",
                pronunciation: "ghen + ra",
                explanation: "Advanced combination: ghen + ra",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_ghen_ra.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "gr",
                pronunciation: "gr",
                explanation: "Advanced combination: gr",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_gr.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "ha",
                pronunciation: "ha",
                explanation: "Advanced combination: ha",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_ha.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "hamza",
                pronunciation: "hamza",
                explanation: "Advanced combination: hamza",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_hamza.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "n + ta",
                pronunciation: "n + ta",
                explanation: "Advanced combination: n + ta",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_n_ta.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "ra",
                pronunciation: "ra",
                explanation: "Advanced combination: ra",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_ra.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "sad + 3en",
                pronunciation: "sad + 3en",
                explanation: "Advanced combination: sad + 3en",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_sad_3en.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "sad + ba",
                pronunciation: "sad + ba",
                explanation: "Advanced combination: sad + ba",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_sad_ba.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "sad",
                pronunciation: "sad",
                explanation: "Advanced combination: sad",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_sad.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "sen + lam",
                pronunciation: "sen + lam",
                explanation: "Advanced combination: sen + lam",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_sen_lam.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "sen",
                pronunciation: "sen",
                explanation: "Advanced combination: sen",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_sen.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "shen + lam",
                pronunciation: "shen + lam",
                explanation: "Advanced combination: shen + lam",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_shen_lam.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "shen",
                pronunciation: "shen",
                explanation: "Advanced combination: shen",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_shen.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "ta + 7a + ta",
                pronunciation: "ta + 7a + ta",
                explanation: "Advanced combination: ta + 7a + ta",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_ta_7a_ta.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "ta + ha",
                pronunciation: "ta + ha",
                explanation: "Advanced combination: ta + ha",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_ta_ha.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "ta",
                pronunciation: "ta",
                explanation: "Advanced combination: ta",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_ta.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "ta + za",
                pronunciation: "ta + za",
                explanation: "Advanced combination: ta + za",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_ta_za.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "t + ghen + z",
                pronunciation: "t + ghen + z",
                explanation: "Advanced combination: t + ghen + z",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_t_ghen_z.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "tha + 2 + n",
                pronunciation: "tha + 2 + n",
                explanation: "Advanced combination: tha + 2 + n",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_tha_2_n.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "tta + ba",
                pronunciation: "tta + ba",
                explanation: "Advanced combination: tta + ba",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_tta_ba.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "tta",
                pronunciation: "tta",
                explanation: "Advanced combination: tta",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_tta.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "tyn",
                pronunciation: "tyn",
                explanation: "Advanced combination: tyn",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_tyn.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "ya + ha",
                pronunciation: "ya + ha",
                explanation: "Advanced combination: ya + ha",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_ya_ha.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "ya + ra",
                pronunciation: "ya + ra",
                explanation: "Advanced combination: ya + ra",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_ya_ra.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "ygb",
                pronunciation: "ygb",
                explanation: "Advanced combination: ygb",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_ygb.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "yhb",
                pronunciation: "yhb",
                explanation: "Advanced combination: yhb",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_yhb.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "ytn",
                pronunciation: "ytn",
                explanation: "Advanced combination: ytn",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_ytn.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "zal",
                pronunciation: "zal",
                explanation: "Advanced combination: zal",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_zal.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "za",
                pronunciation: "za",
                explanation: "Advanced combination: za",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_za.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "zza + alf",
                pronunciation: "zza + alf",
                explanation: "Advanced combination: zza + alf",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_zza_alf.mp3"
            },
            {
                arabic: "تركيب متقدم",
                transliteration: "zza",
                pronunciation: "zza",
                explanation: "Advanced combination: zza",
                hint: "P3 extended pattern",
                audio: "audio/combinations/p3_zza.mp3"
            },
        ]
    },
    4: {
        title: "Lesson 4: Short Vowels Practice (P8-P9 Series)",
        description: "Master Fatha, Kasra, and Damma with harakat",
        cards: [
            {
                arabic: "3aَ",
                transliteration: "3aa",
                pronunciation: "3aa",
                explanation: "Letter 3a with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_3a.mp3"
            },
            {
                arabic: "5aَ",
                transliteration: "5aa",
                pronunciation: "5aa",
                explanation: "Letter 5a with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_5a.mp3"
            },
            {
                arabic: "7aَ",
                transliteration: "7aa",
                pronunciation: "7aa",
                explanation: "Letter 7a with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_7a.mp3"
            },
            {
                arabic: "aaَ",
                transliteration: "aaa",
                pronunciation: "aaa",
                explanation: "Letter aa with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_aa.mp3"
            },
            {
                arabic: "aeَ",
                transliteration: "aea",
                pronunciation: "aea",
                explanation: "Letter ae with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_ae.mp3"
            },
            {
                arabic: "aoَ",
                transliteration: "aoa",
                pronunciation: "aoa",
                explanation: "Letter ao with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_ao.mp3"
            },
            {
                arabic: "baَ",
                transliteration: "baa",
                pronunciation: "baa",
                explanation: "Letter ba with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_ba.mp3"
            },
            {
                arabic: "daَ",
                transliteration: "daa",
                pronunciation: "daa",
                explanation: "Letter da with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_da.mp3"
            },
            {
                arabic: "ddaَ",
                transliteration: "ddaa",
                pronunciation: "ddaa",
                explanation: "Letter dda with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_dda.mp3"
            },
            {
                arabic: "faَ",
                transliteration: "faa",
                pronunciation: "faa",
                explanation: "Letter fa with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_fa.mp3"
            },
            {
                arabic: "gaَ",
                transliteration: "gaa",
                pronunciation: "gaa",
                explanation: "Letter ga with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_ga.mp3"
            },
            {
                arabic: "ghaَ",
                transliteration: "ghaa",
                pronunciation: "ghaa",
                explanation: "Letter gha with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_gha.mp3"
            },
            {
                arabic: "haَ",
                transliteration: "haa",
                pronunciation: "haa",
                explanation: "Letter ha with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_ha.mp3"
            },
            {
                arabic: "heَ",
                transliteration: "hea",
                pronunciation: "hea",
                explanation: "Letter he with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_he.mp3"
            },
            {
                arabic: "hoَ",
                transliteration: "hoa",
                pronunciation: "hoa",
                explanation: "Letter ho with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_ho.mp3"
            },
            {
                arabic: "kaَ",
                transliteration: "kaa",
                pronunciation: "kaa",
                explanation: "Letter ka with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_ka.mp3"
            },
            {
                arabic: "laَ",
                transliteration: "laa",
                pronunciation: "laa",
                explanation: "Letter la with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_la.mp3"
            },
            {
                arabic: "maَ",
                transliteration: "maa",
                pronunciation: "maa",
                explanation: "Letter ma with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_ma.mp3"
            },
            {
                arabic: "naَ",
                transliteration: "naa",
                pronunciation: "naa",
                explanation: "Letter na with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_na.mp3"
            },
            {
                arabic: "qaَ",
                transliteration: "qaa",
                pronunciation: "qaa",
                explanation: "Letter qa with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_qa.mp3"
            },
            {
                arabic: "raَ",
                transliteration: "raa",
                pronunciation: "raa",
                explanation: "Letter ra with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_ra.mp3"
            },
            {
                arabic: "saَ",
                transliteration: "saa",
                pronunciation: "saa",
                explanation: "Letter sa with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_sa.mp3"
            },
            {
                arabic: "shaَ",
                transliteration: "shaa",
                pronunciation: "shaa",
                explanation: "Letter sha with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_sha.mp3"
            },
            {
                arabic: "ssaَ",
                transliteration: "ssaa",
                pronunciation: "ssaa",
                explanation: "Letter ssa with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_ssa.mp3"
            },
            {
                arabic: "taَ",
                transliteration: "taa",
                pronunciation: "taa",
                explanation: "Letter ta with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_ta.mp3"
            },
            {
                arabic: "thaَ",
                transliteration: "thaa",
                pronunciation: "thaa",
                explanation: "Letter tha with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_tha.mp3"
            },
            {
                arabic: "titleَ",
                transliteration: "titlea",
                pronunciation: "titlea",
                explanation: "Letter title with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_title.mp3"
            },
            {
                arabic: "ttaَ",
                transliteration: "ttaa",
                pronunciation: "ttaa",
                explanation: "Letter tta with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_tta.mp3"
            },
            {
                arabic: "waَ",
                transliteration: "waa",
                pronunciation: "waa",
                explanation: "Letter wa with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_wa.mp3"
            },
            {
                arabic: "woَ",
                transliteration: "woa",
                pronunciation: "woa",
                explanation: "Letter wo with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_wo.mp3"
            },
            {
                arabic: "word10َ",
                transliteration: "word10a",
                pronunciation: "word10a",
                explanation: "Letter word10 with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_word10.mp3"
            },
            {
                arabic: "word11َ",
                transliteration: "word11a",
                pronunciation: "word11a",
                explanation: "Letter word11 with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_word11.mp3"
            },
            {
                arabic: "word12َ",
                transliteration: "word12a",
                pronunciation: "word12a",
                explanation: "Letter word12 with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_word12.mp3"
            },
            {
                arabic: "word13َ",
                transliteration: "word13a",
                pronunciation: "word13a",
                explanation: "Letter word13 with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_word13.mp3"
            },
            {
                arabic: "word14َ",
                transliteration: "word14a",
                pronunciation: "word14a",
                explanation: "Letter word14 with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_word14.mp3"
            },
            {
                arabic: "word15َ",
                transliteration: "word15a",
                pronunciation: "word15a",
                explanation: "Letter word15 with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_word15.mp3"
            },
            {
                arabic: "word16َ",
                transliteration: "word16a",
                pronunciation: "word16a",
                explanation: "Letter word16 with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_word16.mp3"
            },
            {
                arabic: "word17َ",
                transliteration: "word17a",
                pronunciation: "word17a",
                explanation: "Letter word17 with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_word17.mp3"
            },
            {
                arabic: "word18َ",
                transliteration: "word18a",
                pronunciation: "word18a",
                explanation: "Letter word18 with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_word18.mp3"
            },
            {
                arabic: "word1َ",
                transliteration: "word1a",
                pronunciation: "word1a",
                explanation: "Letter word1 with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_word1.mp3"
            },
            {
                arabic: "word2َ",
                transliteration: "word2a",
                pronunciation: "word2a",
                explanation: "Letter word2 with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_word2.mp3"
            },
            {
                arabic: "word3َ",
                transliteration: "word3a",
                pronunciation: "word3a",
                explanation: "Letter word3 with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_word3.mp3"
            },
            {
                arabic: "word4َ",
                transliteration: "word4a",
                pronunciation: "word4a",
                explanation: "Letter word4 with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_word4.mp3"
            },
            {
                arabic: "word5َ",
                transliteration: "word5a",
                pronunciation: "word5a",
                explanation: "Letter word5 with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_word5.mp3"
            },
            {
                arabic: "word6َ",
                transliteration: "word6a",
                pronunciation: "word6a",
                explanation: "Letter word6 with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_word6.mp3"
            },
            {
                arabic: "word7َ",
                transliteration: "word7a",
                pronunciation: "word7a",
                explanation: "Letter word7 with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_word7.mp3"
            },
            {
                arabic: "word8َ",
                transliteration: "word8a",
                pronunciation: "word8a",
                explanation: "Letter word8 with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_word8.mp3"
            },
            {
                arabic: "word9َ",
                transliteration: "word9a",
                pronunciation: "word9a",
                explanation: "Letter word9 with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_word9.mp3"
            },
            {
                arabic: "yaَ",
                transliteration: "yaa",
                pronunciation: "yaa",
                explanation: "Letter ya with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_ya.mp3"
            },
            {
                arabic: "zalaَ",
                transliteration: "zalaa",
                pronunciation: "zalaa",
                explanation: "Letter zala with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_zala.mp3"
            },
            {
                arabic: "zaَ",
                transliteration: "zaa",
                pronunciation: "zaa",
                explanation: "Letter za with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_za.mp3"
            },
            {
                arabic: "zzaَ",
                transliteration: "zzaa",
                pronunciation: "zzaa",
                explanation: "Letter zza with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p8_zza.mp3"
            },
            {
                arabic: "3aَ",
                transliteration: "3aa",
                pronunciation: "3aa",
                explanation: "Letter 3a with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_3a.mp3"
            },
            {
                arabic: "3eَ",
                transliteration: "3ea",
                pronunciation: "3ea",
                explanation: "Letter 3e with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_3e.mp3"
            },
            {
                arabic: "3oَ",
                transliteration: "3oa",
                pronunciation: "3oa",
                explanation: "Letter 3o with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_3o.mp3"
            },
            {
                arabic: "5aَ",
                transliteration: "5aa",
                pronunciation: "5aa",
                explanation: "Letter 5a with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_5a.mp3"
            },
            {
                arabic: "5eَ",
                transliteration: "5ea",
                pronunciation: "5ea",
                explanation: "Letter 5e with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_5e.mp3"
            },
            {
                arabic: "5oَ",
                transliteration: "5oa",
                pronunciation: "5oa",
                explanation: "Letter 5o with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_5o.mp3"
            },
            {
                arabic: "7aَ",
                transliteration: "7aa",
                pronunciation: "7aa",
                explanation: "Letter 7a with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_7a.mp3"
            },
            {
                arabic: "7eَ",
                transliteration: "7ea",
                pronunciation: "7ea",
                explanation: "Letter 7e with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_7e.mp3"
            },
            {
                arabic: "7oَ",
                transliteration: "7oa",
                pronunciation: "7oa",
                explanation: "Letter 7o with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_7o.mp3"
            },
            {
                arabic: "aaَ",
                transliteration: "aaa",
                pronunciation: "aaa",
                explanation: "Letter aa with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_aa.mp3"
            },
            {
                arabic: "aeَ",
                transliteration: "aea",
                pronunciation: "aea",
                explanation: "Letter ae with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_ae.mp3"
            },
            {
                arabic: "aoَ",
                transliteration: "aoa",
                pronunciation: "aoa",
                explanation: "Letter ao with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_ao.mp3"
            },
            {
                arabic: "baَ",
                transliteration: "baa",
                pronunciation: "baa",
                explanation: "Letter ba with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_ba.mp3"
            },
            {
                arabic: "beَ",
                transliteration: "bea",
                pronunciation: "bea",
                explanation: "Letter be with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_be.mp3"
            },
            {
                arabic: "boَ",
                transliteration: "boa",
                pronunciation: "boa",
                explanation: "Letter bo with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_bo.mp3"
            },
            {
                arabic: "daَ",
                transliteration: "daa",
                pronunciation: "daa",
                explanation: "Letter da with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_da.mp3"
            },
            {
                arabic: "ddaَ",
                transliteration: "ddaa",
                pronunciation: "ddaa",
                explanation: "Letter dda with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_dda.mp3"
            },
            {
                arabic: "ddeَ",
                transliteration: "ddea",
                pronunciation: "ddea",
                explanation: "Letter dde with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_dde.mp3"
            },
            {
                arabic: "ddoَ",
                transliteration: "ddoa",
                pronunciation: "ddoa",
                explanation: "Letter ddo with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_ddo.mp3"
            },
            {
                arabic: "deَ",
                transliteration: "dea",
                pronunciation: "dea",
                explanation: "Letter de with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_de.mp3"
            },
            {
                arabic: "doَ",
                transliteration: "doa",
                pronunciation: "doa",
                explanation: "Letter do with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_do.mp3"
            },
            {
                arabic: "faَ",
                transliteration: "faa",
                pronunciation: "faa",
                explanation: "Letter fa with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_fa.mp3"
            },
            {
                arabic: "feَ",
                transliteration: "fea",
                pronunciation: "fea",
                explanation: "Letter fe with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_fe.mp3"
            },
            {
                arabic: "foَ",
                transliteration: "foa",
                pronunciation: "foa",
                explanation: "Letter fo with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_fo.mp3"
            },
            {
                arabic: "gaَ",
                transliteration: "gaa",
                pronunciation: "gaa",
                explanation: "Letter ga with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_ga.mp3"
            },
            {
                arabic: "geَ",
                transliteration: "gea",
                pronunciation: "gea",
                explanation: "Letter ge with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_ge.mp3"
            },
            {
                arabic: "goَ",
                transliteration: "goa",
                pronunciation: "goa",
                explanation: "Letter go with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_go.mp3"
            },
            {
                arabic: "haَ",
                transliteration: "haa",
                pronunciation: "haa",
                explanation: "Letter ha with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_ha.mp3"
            },
            {
                arabic: "heَ",
                transliteration: "hea",
                pronunciation: "hea",
                explanation: "Letter he with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_he.mp3"
            },
            {
                arabic: "hoَ",
                transliteration: "hoa",
                pronunciation: "hoa",
                explanation: "Letter ho with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_ho.mp3"
            },
            {
                arabic: "raَ",
                transliteration: "raa",
                pronunciation: "raa",
                explanation: "Letter ra with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_ra.mp3"
            },
            {
                arabic: "reَ",
                transliteration: "rea",
                pronunciation: "rea",
                explanation: "Letter re with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_re.mp3"
            },
            {
                arabic: "roَ",
                transliteration: "roa",
                pronunciation: "roa",
                explanation: "Letter ro with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_ro.mp3"
            },
            {
                arabic: "saَ",
                transliteration: "saa",
                pronunciation: "saa",
                explanation: "Letter sa with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_sa.mp3"
            },
            {
                arabic: "seَ",
                transliteration: "sea",
                pronunciation: "sea",
                explanation: "Letter se with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_se.mp3"
            },
            {
                arabic: "shaَ",
                transliteration: "shaa",
                pronunciation: "shaa",
                explanation: "Letter sha with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_sha.mp3"
            },
            {
                arabic: "sheَ",
                transliteration: "shea",
                pronunciation: "shea",
                explanation: "Letter she with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_she.mp3"
            },
            {
                arabic: "shoَ",
                transliteration: "shoa",
                pronunciation: "shoa",
                explanation: "Letter sho with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_sho.mp3"
            },
            {
                arabic: "soَ",
                transliteration: "soa",
                pronunciation: "soa",
                explanation: "Letter so with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_so.mp3"
            },
            {
                arabic: "ssaَ",
                transliteration: "ssaa",
                pronunciation: "ssaa",
                explanation: "Letter ssa with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_ssa.mp3"
            },
            {
                arabic: "sseَ",
                transliteration: "ssea",
                pronunciation: "ssea",
                explanation: "Letter sse with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_sse.mp3"
            },
            {
                arabic: "ssoَ",
                transliteration: "ssoa",
                pronunciation: "ssoa",
                explanation: "Letter sso with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_sso.mp3"
            },
            {
                arabic: "taَ",
                transliteration: "taa",
                pronunciation: "taa",
                explanation: "Letter ta with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_ta.mp3"
            },
            {
                arabic: "teَ",
                transliteration: "tea",
                pronunciation: "tea",
                explanation: "Letter te with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_te.mp3"
            },
            {
                arabic: "thaَ",
                transliteration: "thaa",
                pronunciation: "thaa",
                explanation: "Letter tha with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_tha.mp3"
            },
            {
                arabic: "theَ",
                transliteration: "thea",
                pronunciation: "thea",
                explanation: "Letter the with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_the.mp3"
            },
            {
                arabic: "thoَ",
                transliteration: "thoa",
                pronunciation: "thoa",
                explanation: "Letter tho with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_tho.mp3"
            },
            {
                arabic: "titleَ",
                transliteration: "titlea",
                pronunciation: "titlea",
                explanation: "Letter title with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_title.mp3"
            },
            {
                arabic: "toَ",
                transliteration: "toa",
                pronunciation: "toa",
                explanation: "Letter to with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_to.mp3"
            },
            {
                arabic: "ttaَ",
                transliteration: "ttaa",
                pronunciation: "ttaa",
                explanation: "Letter tta with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_tta.mp3"
            },
            {
                arabic: "tteَ",
                transliteration: "ttea",
                pronunciation: "ttea",
                explanation: "Letter tte with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_tte.mp3"
            },
            {
                arabic: "ttoَ",
                transliteration: "ttoa",
                pronunciation: "ttoa",
                explanation: "Letter tto with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_tto.mp3"
            },
            {
                arabic: "yaَ",
                transliteration: "yaa",
                pronunciation: "yaa",
                explanation: "Letter ya with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_ya.mp3"
            },
            {
                arabic: "yeَ",
                transliteration: "yea",
                pronunciation: "yea",
                explanation: "Letter ye with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_ye.mp3"
            },
            {
                arabic: "yoَ",
                transliteration: "yoa",
                pronunciation: "yoa",
                explanation: "Letter yo with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_yo.mp3"
            },
            {
                arabic: "zalaَ",
                transliteration: "zalaa",
                pronunciation: "zalaa",
                explanation: "Letter zala with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_zala.mp3"
            },
            {
                arabic: "zaleَ",
                transliteration: "zalea",
                pronunciation: "zalea",
                explanation: "Letter zale with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_zale.mp3"
            },
            {
                arabic: "zaloَ",
                transliteration: "zaloa",
                pronunciation: "zaloa",
                explanation: "Letter zalo with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_zalo.mp3"
            },
            {
                arabic: "zaَ",
                transliteration: "zaa",
                pronunciation: "zaa",
                explanation: "Letter za with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_za.mp3"
            },
            {
                arabic: "zeَ",
                transliteration: "zea",
                pronunciation: "zea",
                explanation: "Letter ze with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_ze.mp3"
            },
            {
                arabic: "zoَ",
                transliteration: "zoa",
                pronunciation: "zoa",
                explanation: "Letter zo with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_zo.mp3"
            },
            {
                arabic: "zzaَ",
                transliteration: "zzaa",
                pronunciation: "zzaa",
                explanation: "Letter zza with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_zza.mp3"
            },
            {
                arabic: "zzeَ",
                transliteration: "zzea",
                pronunciation: "zzea",
                explanation: "Letter zze with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_zze.mp3"
            },
            {
                arabic: "zzoَ",
                transliteration: "zzoa",
                pronunciation: "zzoa",
                explanation: "Letter zzo with fatha (short 'a' vowel)",
                hint: "Harakat practice",
                audio: "audio/harakat/p9_zzo.mp3"
            },
        ]
    },
    5: {
        title: "Lesson 5: Long Vowels (P10-P11 Series)",
        description: "Master Madd - long vowel sounds",
        cards: [
            {
                arabic: "3aeا",
                transliteration: "3aeaa",
                pronunciation: "3aeaa",
                explanation: "Long vowel: 3ae + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_3ae.mp3"
            },
            {
                arabic: "3aoا",
                transliteration: "3aoaa",
                pronunciation: "3aoaa",
                explanation: "Long vowel: 3ao + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_3ao.mp3"
            },
            {
                arabic: "5aeا",
                transliteration: "5aeaa",
                pronunciation: "5aeaa",
                explanation: "Long vowel: 5ae + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_5ae.mp3"
            },
            {
                arabic: "5aoا",
                transliteration: "5aoaa",
                pronunciation: "5aoaa",
                explanation: "Long vowel: 5ao + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_5ao.mp3"
            },
            {
                arabic: "7aeا",
                transliteration: "7aeaa",
                pronunciation: "7aeaa",
                explanation: "Long vowel: 7ae + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_7ae.mp3"
            },
            {
                arabic: "7aoا",
                transliteration: "7aoaa",
                pronunciation: "7aoaa",
                explanation: "Long vowel: 7ao + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_7ao.mp3"
            },
            {
                arabic: "aaeا",
                transliteration: "aaeaa",
                pronunciation: "aaeaa",
                explanation: "Long vowel: aae + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_aae.mp3"
            },
            {
                arabic: "aaoا",
                transliteration: "aaoaa",
                pronunciation: "aaoaa",
                explanation: "Long vowel: aao + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_aao.mp3"
            },
            {
                arabic: "baeا",
                transliteration: "baeaa",
                pronunciation: "baeaa",
                explanation: "Long vowel: bae + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_bae.mp3"
            },
            {
                arabic: "baoا",
                transliteration: "baoaa",
                pronunciation: "baoaa",
                explanation: "Long vowel: bao + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_bao.mp3"
            },
            {
                arabic: "daeا",
                transliteration: "daeaa",
                pronunciation: "daeaa",
                explanation: "Long vowel: dae + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_dae.mp3"
            },
            {
                arabic: "daoا",
                transliteration: "daoaa",
                pronunciation: "daoaa",
                explanation: "Long vowel: dao + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_dao.mp3"
            },
            {
                arabic: "ddaeا",
                transliteration: "ddaeaa",
                pronunciation: "ddaeaa",
                explanation: "Long vowel: ddae + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_ddae.mp3"
            },
            {
                arabic: "ddaoا",
                transliteration: "ddaoaa",
                pronunciation: "ddaoaa",
                explanation: "Long vowel: ddao + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_ddao.mp3"
            },
            {
                arabic: "faeا",
                transliteration: "faeaa",
                pronunciation: "faeaa",
                explanation: "Long vowel: fae + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_fae.mp3"
            },
            {
                arabic: "faoا",
                transliteration: "faoaa",
                pronunciation: "faoaa",
                explanation: "Long vowel: fao + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_fao.mp3"
            },
            {
                arabic: "gaeا",
                transliteration: "gaeaa",
                pronunciation: "gaeaa",
                explanation: "Long vowel: gae + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_gae.mp3"
            },
            {
                arabic: "gaoا",
                transliteration: "gaoaa",
                pronunciation: "gaoaa",
                explanation: "Long vowel: gao + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_gao.mp3"
            },
            {
                arabic: "ghaeا",
                transliteration: "ghaeaa",
                pronunciation: "ghaeaa",
                explanation: "Long vowel: ghae + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_ghae.mp3"
            },
            {
                arabic: "ghaا",
                transliteration: "ghaaa",
                pronunciation: "ghaaa",
                explanation: "Long vowel: gha + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_gha.mp3"
            },
            {
                arabic: "ghaoا",
                transliteration: "ghaoaa",
                pronunciation: "ghaoaa",
                explanation: "Long vowel: ghao + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_ghao.mp3"
            },
            {
                arabic: "gheا",
                transliteration: "gheaa",
                pronunciation: "gheaa",
                explanation: "Long vowel: ghe + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_ghe.mp3"
            },
            {
                arabic: "ghoا",
                transliteration: "ghoaa",
                pronunciation: "ghoaa",
                explanation: "Long vowel: gho + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_gho.mp3"
            },
            {
                arabic: "kaeا",
                transliteration: "kaeaa",
                pronunciation: "kaeaa",
                explanation: "Long vowel: kae + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_kae.mp3"
            },
            {
                arabic: "kaا",
                transliteration: "kaaa",
                pronunciation: "kaaa",
                explanation: "Long vowel: ka + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_ka.mp3"
            },
            {
                arabic: "kaoا",
                transliteration: "kaoaa",
                pronunciation: "kaoaa",
                explanation: "Long vowel: kao + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_kao.mp3"
            },
            {
                arabic: "keا",
                transliteration: "keaa",
                pronunciation: "keaa",
                explanation: "Long vowel: ke + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_ke.mp3"
            },
            {
                arabic: "koا",
                transliteration: "koaa",
                pronunciation: "koaa",
                explanation: "Long vowel: ko + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_ko.mp3"
            },
            {
                arabic: "laeا",
                transliteration: "laeaa",
                pronunciation: "laeaa",
                explanation: "Long vowel: lae + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_lae.mp3"
            },
            {
                arabic: "laا",
                transliteration: "laaa",
                pronunciation: "laaa",
                explanation: "Long vowel: la + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_la.mp3"
            },
            {
                arabic: "laoا",
                transliteration: "laoaa",
                pronunciation: "laoaa",
                explanation: "Long vowel: lao + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_lao.mp3"
            },
            {
                arabic: "leا",
                transliteration: "leaa",
                pronunciation: "leaa",
                explanation: "Long vowel: le + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_le.mp3"
            },
            {
                arabic: "loا",
                transliteration: "loaa",
                pronunciation: "loaa",
                explanation: "Long vowel: lo + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_lo.mp3"
            },
            {
                arabic: "maا",
                transliteration: "maaa",
                pronunciation: "maaa",
                explanation: "Long vowel: ma + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_ma.mp3"
            },
            {
                arabic: "maoا",
                transliteration: "maoaa",
                pronunciation: "maoaa",
                explanation: "Long vowel: mao + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_mao.mp3"
            },
            {
                arabic: "meا",
                transliteration: "meaa",
                pronunciation: "meaa",
                explanation: "Long vowel: me + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_me.mp3"
            },
            {
                arabic: "moا",
                transliteration: "moaa",
                pronunciation: "moaa",
                explanation: "Long vowel: mo + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_mo.mp3"
            },
            {
                arabic: "naeا",
                transliteration: "naeaa",
                pronunciation: "naeaa",
                explanation: "Long vowel: nae + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_nae.mp3"
            },
            {
                arabic: "naا",
                transliteration: "naaa",
                pronunciation: "naaa",
                explanation: "Long vowel: na + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_na.mp3"
            },
            {
                arabic: "naoا",
                transliteration: "naoaa",
                pronunciation: "naoaa",
                explanation: "Long vowel: nao + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_nao.mp3"
            },
            {
                arabic: "neا",
                transliteration: "neaa",
                pronunciation: "neaa",
                explanation: "Long vowel: ne + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_ne.mp3"
            },
            {
                arabic: "noا",
                transliteration: "noaa",
                pronunciation: "noaa",
                explanation: "Long vowel: no + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_no.mp3"
            },
            {
                arabic: "qaeا",
                transliteration: "qaeaa",
                pronunciation: "qaeaa",
                explanation: "Long vowel: qae + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_qae.mp3"
            },
            {
                arabic: "qaا",
                transliteration: "qaaa",
                pronunciation: "qaaa",
                explanation: "Long vowel: qa + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_qa.mp3"
            },
            {
                arabic: "qaoا",
                transliteration: "qaoaa",
                pronunciation: "qaoaa",
                explanation: "Long vowel: qao + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_qao.mp3"
            },
            {
                arabic: "qeا",
                transliteration: "qeaa",
                pronunciation: "qeaa",
                explanation: "Long vowel: qe + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_qe.mp3"
            },
            {
                arabic: "qoا",
                transliteration: "qoaa",
                pronunciation: "qoaa",
                explanation: "Long vowel: qo + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_qo.mp3"
            },
            {
                arabic: "raeا",
                transliteration: "raeaa",
                pronunciation: "raeaa",
                explanation: "Long vowel: rae + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_rae.mp3"
            },
            {
                arabic: "raoا",
                transliteration: "raoaa",
                pronunciation: "raoaa",
                explanation: "Long vowel: rao + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_rao.mp3"
            },
            {
                arabic: "saeا",
                transliteration: "saeaa",
                pronunciation: "saeaa",
                explanation: "Long vowel: sae + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_sae.mp3"
            },
            {
                arabic: "saoا",
                transliteration: "saoaa",
                pronunciation: "saoaa",
                explanation: "Long vowel: sao + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_sao.mp3"
            },
            {
                arabic: "shaeا",
                transliteration: "shaeaa",
                pronunciation: "shaeaa",
                explanation: "Long vowel: shae + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_shae.mp3"
            },
            {
                arabic: "shaoا",
                transliteration: "shaoaa",
                pronunciation: "shaoaa",
                explanation: "Long vowel: shao + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_shao.mp3"
            },
            {
                arabic: "ssaeا",
                transliteration: "ssaeaa",
                pronunciation: "ssaeaa",
                explanation: "Long vowel: ssae + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_ssae.mp3"
            },
            {
                arabic: "ssaoا",
                transliteration: "ssaoaa",
                pronunciation: "ssaoaa",
                explanation: "Long vowel: ssao + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_ssao.mp3"
            },
            {
                arabic: "taeا",
                transliteration: "taeaa",
                pronunciation: "taeaa",
                explanation: "Long vowel: tae + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_tae.mp3"
            },
            {
                arabic: "taoا",
                transliteration: "taoaa",
                pronunciation: "taoaa",
                explanation: "Long vowel: tao + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_tao.mp3"
            },
            {
                arabic: "thaeا",
                transliteration: "thaeaa",
                pronunciation: "thaeaa",
                explanation: "Long vowel: thae + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_thae.mp3"
            },
            {
                arabic: "thaoا",
                transliteration: "thaoaa",
                pronunciation: "thaoaa",
                explanation: "Long vowel: thao + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_thao.mp3"
            },
            {
                arabic: "ttaeا",
                transliteration: "ttaeaa",
                pronunciation: "ttaeaa",
                explanation: "Long vowel: ttae + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_ttae.mp3"
            },
            {
                arabic: "ttaoا",
                transliteration: "ttaoaa",
                pronunciation: "ttaoaa",
                explanation: "Long vowel: ttao + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_ttao.mp3"
            },
            {
                arabic: "waا",
                transliteration: "waaa",
                pronunciation: "waaa",
                explanation: "Long vowel: wa + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_wa.mp3"
            },
            {
                arabic: "weا",
                transliteration: "weaa",
                pronunciation: "weaa",
                explanation: "Long vowel: we + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_we.mp3"
            },
            {
                arabic: "woا",
                transliteration: "woaa",
                pronunciation: "woaa",
                explanation: "Long vowel: wo + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_wo.mp3"
            },
            {
                arabic: "zaeا",
                transliteration: "zaeaa",
                pronunciation: "zaeaa",
                explanation: "Long vowel: zae + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_zae.mp3"
            },
            {
                arabic: "zaleا",
                transliteration: "zaleaa",
                pronunciation: "zaleaa",
                explanation: "Long vowel: zale + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_zale.mp3"
            },
            {
                arabic: "zaloا",
                transliteration: "zaloaa",
                pronunciation: "zaloaa",
                explanation: "Long vowel: zalo + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_zalo.mp3"
            },
            {
                arabic: "zaoا",
                transliteration: "zaoaa",
                pronunciation: "zaoaa",
                explanation: "Long vowel: zao + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_zao.mp3"
            },
            {
                arabic: "zzaeا",
                transliteration: "zzaeaa",
                pronunciation: "zzaeaa",
                explanation: "Long vowel: zzae + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_zzae.mp3"
            },
            {
                arabic: "zzaoا",
                transliteration: "zzaoaa",
                pronunciation: "zzaoaa",
                explanation: "Long vowel: zzao + alif",
                hint: "Madd practice",
                audio: "audio/madd/p10_zzao.mp3"
            },
            {
                arabic: "haeا",
                transliteration: "haeaa",
                pronunciation: "haeaa",
                explanation: "Long vowel: hae + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_hae.mp3"
            },
            {
                arabic: "haoا",
                transliteration: "haoaa",
                pronunciation: "haoaa",
                explanation: "Long vowel: hao + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_hao.mp3"
            },
            {
                arabic: "maeا",
                transliteration: "maeaa",
                pronunciation: "maeaa",
                explanation: "Long vowel: mae + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_mae.mp3"
            },
            {
                arabic: "titleا",
                transliteration: "titleaa",
                pronunciation: "titleaa",
                explanation: "Long vowel: title + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_title.mp3"
            },
            {
                arabic: "waeا",
                transliteration: "waeaa",
                pronunciation: "waeaa",
                explanation: "Long vowel: wae + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_wae.mp3"
            },
            {
                arabic: "waoا",
                transliteration: "waoaa",
                pronunciation: "waoaa",
                explanation: "Long vowel: wao + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_wao.mp3"
            },
            {
                arabic: "word10ا",
                transliteration: "word10aa",
                pronunciation: "word10aa",
                explanation: "Long vowel: word10 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word10.mp3"
            },
            {
                arabic: "word11ا",
                transliteration: "word11aa",
                pronunciation: "word11aa",
                explanation: "Long vowel: word11 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word11.mp3"
            },
            {
                arabic: "word12ا",
                transliteration: "word12aa",
                pronunciation: "word12aa",
                explanation: "Long vowel: word12 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word12.mp3"
            },
            {
                arabic: "word13ا",
                transliteration: "word13aa",
                pronunciation: "word13aa",
                explanation: "Long vowel: word13 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word13.mp3"
            },
            {
                arabic: "word14ا",
                transliteration: "word14aa",
                pronunciation: "word14aa",
                explanation: "Long vowel: word14 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word14.mp3"
            },
            {
                arabic: "word15ا",
                transliteration: "word15aa",
                pronunciation: "word15aa",
                explanation: "Long vowel: word15 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word15.mp3"
            },
            {
                arabic: "word16ا",
                transliteration: "word16aa",
                pronunciation: "word16aa",
                explanation: "Long vowel: word16 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word16.mp3"
            },
            {
                arabic: "word17ا",
                transliteration: "word17aa",
                pronunciation: "word17aa",
                explanation: "Long vowel: word17 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word17.mp3"
            },
            {
                arabic: "word18ا",
                transliteration: "word18aa",
                pronunciation: "word18aa",
                explanation: "Long vowel: word18 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word18.mp3"
            },
            {
                arabic: "word19ا",
                transliteration: "word19aa",
                pronunciation: "word19aa",
                explanation: "Long vowel: word19 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word19.mp3"
            },
            {
                arabic: "word1ا",
                transliteration: "word1aa",
                pronunciation: "word1aa",
                explanation: "Long vowel: word1 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word1.mp3"
            },
            {
                arabic: "word20ا",
                transliteration: "word20aa",
                pronunciation: "word20aa",
                explanation: "Long vowel: word20 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word20.mp3"
            },
            {
                arabic: "word21ا",
                transliteration: "word21aa",
                pronunciation: "word21aa",
                explanation: "Long vowel: word21 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word21.mp3"
            },
            {
                arabic: "word22ا",
                transliteration: "word22aa",
                pronunciation: "word22aa",
                explanation: "Long vowel: word22 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word22.mp3"
            },
            {
                arabic: "word23ا",
                transliteration: "word23aa",
                pronunciation: "word23aa",
                explanation: "Long vowel: word23 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word23.mp3"
            },
            {
                arabic: "word24ا",
                transliteration: "word24aa",
                pronunciation: "word24aa",
                explanation: "Long vowel: word24 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word24.mp3"
            },
            {
                arabic: "word25ا",
                transliteration: "word25aa",
                pronunciation: "word25aa",
                explanation: "Long vowel: word25 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word25.mp3"
            },
            {
                arabic: "word26ا",
                transliteration: "word26aa",
                pronunciation: "word26aa",
                explanation: "Long vowel: word26 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word26.mp3"
            },
            {
                arabic: "word27ا",
                transliteration: "word27aa",
                pronunciation: "word27aa",
                explanation: "Long vowel: word27 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word27.mp3"
            },
            {
                arabic: "word28ا",
                transliteration: "word28aa",
                pronunciation: "word28aa",
                explanation: "Long vowel: word28 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word28.mp3"
            },
            {
                arabic: "word29ا",
                transliteration: "word29aa",
                pronunciation: "word29aa",
                explanation: "Long vowel: word29 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word29.mp3"
            },
            {
                arabic: "word2ا",
                transliteration: "word2aa",
                pronunciation: "word2aa",
                explanation: "Long vowel: word2 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word2.mp3"
            },
            {
                arabic: "word30ا",
                transliteration: "word30aa",
                pronunciation: "word30aa",
                explanation: "Long vowel: word30 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word30.mp3"
            },
            {
                arabic: "word31ا",
                transliteration: "word31aa",
                pronunciation: "word31aa",
                explanation: "Long vowel: word31 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word31.mp3"
            },
            {
                arabic: "word32ا",
                transliteration: "word32aa",
                pronunciation: "word32aa",
                explanation: "Long vowel: word32 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word32.mp3"
            },
            {
                arabic: "word33ا",
                transliteration: "word33aa",
                pronunciation: "word33aa",
                explanation: "Long vowel: word33 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word33.mp3"
            },
            {
                arabic: "word34ا",
                transliteration: "word34aa",
                pronunciation: "word34aa",
                explanation: "Long vowel: word34 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word34.mp3"
            },
            {
                arabic: "word35ا",
                transliteration: "word35aa",
                pronunciation: "word35aa",
                explanation: "Long vowel: word35 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word35.mp3"
            },
            {
                arabic: "word36ا",
                transliteration: "word36aa",
                pronunciation: "word36aa",
                explanation: "Long vowel: word36 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word36.mp3"
            },
            {
                arabic: "word37ا",
                transliteration: "word37aa",
                pronunciation: "word37aa",
                explanation: "Long vowel: word37 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word37.mp3"
            },
            {
                arabic: "word38ا",
                transliteration: "word38aa",
                pronunciation: "word38aa",
                explanation: "Long vowel: word38 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word38.mp3"
            },
            {
                arabic: "word39ا",
                transliteration: "word39aa",
                pronunciation: "word39aa",
                explanation: "Long vowel: word39 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word39.mp3"
            },
            {
                arabic: "word3ا",
                transliteration: "word3aa",
                pronunciation: "word3aa",
                explanation: "Long vowel: word3 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word3.mp3"
            },
            {
                arabic: "word40ا",
                transliteration: "word40aa",
                pronunciation: "word40aa",
                explanation: "Long vowel: word40 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word40.mp3"
            },
            {
                arabic: "word41ا",
                transliteration: "word41aa",
                pronunciation: "word41aa",
                explanation: "Long vowel: word41 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word41.mp3"
            },
            {
                arabic: "word42ا",
                transliteration: "word42aa",
                pronunciation: "word42aa",
                explanation: "Long vowel: word42 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word42.mp3"
            },
            {
                arabic: "word4ا",
                transliteration: "word4aa",
                pronunciation: "word4aa",
                explanation: "Long vowel: word4 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word4.mp3"
            },
            {
                arabic: "word5ا",
                transliteration: "word5aa",
                pronunciation: "word5aa",
                explanation: "Long vowel: word5 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word5.mp3"
            },
            {
                arabic: "word6ا",
                transliteration: "word6aa",
                pronunciation: "word6aa",
                explanation: "Long vowel: word6 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word6.mp3"
            },
            {
                arabic: "word7ا",
                transliteration: "word7aa",
                pronunciation: "word7aa",
                explanation: "Long vowel: word7 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word7.mp3"
            },
            {
                arabic: "word8ا",
                transliteration: "word8aa",
                pronunciation: "word8aa",
                explanation: "Long vowel: word8 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word8.mp3"
            },
            {
                arabic: "word9ا",
                transliteration: "word9aa",
                pronunciation: "word9aa",
                explanation: "Long vowel: word9 + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_word9.mp3"
            },
            {
                arabic: "yaeا",
                transliteration: "yaeaa",
                pronunciation: "yaeaa",
                explanation: "Long vowel: yae + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_yae.mp3"
            },
            {
                arabic: "yaoا",
                transliteration: "yaoaa",
                pronunciation: "yaoaa",
                explanation: "Long vowel: yao + alif",
                hint: "Madd practice",
                audio: "audio/madd/p11_yao.mp3"
            },
        ]
    },
    6: {
        title: "Lesson 6: Sukun & Shaddah (P5-P6 Series)",
        description: "Learn silent letters and doubled consonants",
        cards: [
            {
                arabic: "سكون/شدة",
                transliteration: "31",
                pronunciation: "31",
                explanation: "Sukun/Shaddah pattern: 31",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_31.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "32",
                pronunciation: "32",
                explanation: "Sukun/Shaddah pattern: 32",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_32.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "33",
                pronunciation: "33",
                explanation: "Sukun/Shaddah pattern: 33",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_33.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "51",
                pronunciation: "51",
                explanation: "Sukun/Shaddah pattern: 51",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_51.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "52",
                pronunciation: "52",
                explanation: "Sukun/Shaddah pattern: 52",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_52.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "53",
                pronunciation: "53",
                explanation: "Sukun/Shaddah pattern: 53",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_53.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "71",
                pronunciation: "71",
                explanation: "Sukun/Shaddah pattern: 71",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_71.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "72",
                pronunciation: "72",
                explanation: "Sukun/Shaddah pattern: 72",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_72.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "73",
                pronunciation: "73",
                explanation: "Sukun/Shaddah pattern: 73",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_73.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "a1",
                pronunciation: "a1",
                explanation: "Sukun/Shaddah pattern: a1",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_a1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "a2",
                pronunciation: "a2",
                explanation: "Sukun/Shaddah pattern: a2",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_a2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "a3",
                pronunciation: "a3",
                explanation: "Sukun/Shaddah pattern: a3",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_a3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "d1",
                pronunciation: "d1",
                explanation: "Sukun/Shaddah pattern: d1",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_d1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "d2",
                pronunciation: "d2",
                explanation: "Sukun/Shaddah pattern: d2",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_d2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "d3",
                pronunciation: "d3",
                explanation: "Sukun/Shaddah pattern: d3",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_d3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "dd1",
                pronunciation: "dd1",
                explanation: "Sukun/Shaddah pattern: dd1",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_dd1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "dd2",
                pronunciation: "dd2",
                explanation: "Sukun/Shaddah pattern: dd2",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_dd2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "dd3",
                pronunciation: "dd3",
                explanation: "Sukun/Shaddah pattern: dd3",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_dd3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "g1",
                pronunciation: "g1",
                explanation: "Sukun/Shaddah pattern: g1",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_g1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "g2",
                pronunciation: "g2",
                explanation: "Sukun/Shaddah pattern: g2",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_g2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "g3",
                pronunciation: "g3",
                explanation: "Sukun/Shaddah pattern: g3",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_g3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "gh1",
                pronunciation: "gh1",
                explanation: "Sukun/Shaddah pattern: gh1",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_gh1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "gh2",
                pronunciation: "gh2",
                explanation: "Sukun/Shaddah pattern: gh2",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_gh2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "gh3",
                pronunciation: "gh3",
                explanation: "Sukun/Shaddah pattern: gh3",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_gh3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "h1",
                pronunciation: "h1",
                explanation: "Sukun/Shaddah pattern: h1",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_h1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "h2",
                pronunciation: "h2",
                explanation: "Sukun/Shaddah pattern: h2",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_h2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "h3",
                pronunciation: "h3",
                explanation: "Sukun/Shaddah pattern: h3",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_h3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "k1",
                pronunciation: "k1",
                explanation: "Sukun/Shaddah pattern: k1",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_k1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "k2",
                pronunciation: "k2",
                explanation: "Sukun/Shaddah pattern: k2",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_k2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "k3",
                pronunciation: "k3",
                explanation: "Sukun/Shaddah pattern: k3",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_k3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "l1",
                pronunciation: "l1",
                explanation: "Sukun/Shaddah pattern: l1",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_l1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "l2",
                pronunciation: "l2",
                explanation: "Sukun/Shaddah pattern: l2",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_l2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "l3",
                pronunciation: "l3",
                explanation: "Sukun/Shaddah pattern: l3",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_l3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "n1",
                pronunciation: "n1",
                explanation: "Sukun/Shaddah pattern: n1",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_n1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "n2",
                pronunciation: "n2",
                explanation: "Sukun/Shaddah pattern: n2",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_n2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "n3",
                pronunciation: "n3",
                explanation: "Sukun/Shaddah pattern: n3",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_n3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "q1",
                pronunciation: "q1",
                explanation: "Sukun/Shaddah pattern: q1",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_q1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "q2",
                pronunciation: "q2",
                explanation: "Sukun/Shaddah pattern: q2",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_q2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "q3",
                pronunciation: "q3",
                explanation: "Sukun/Shaddah pattern: q3",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_q3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "r1",
                pronunciation: "r1",
                explanation: "Sukun/Shaddah pattern: r1",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_r1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "r2",
                pronunciation: "r2",
                explanation: "Sukun/Shaddah pattern: r2",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_r2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "r3",
                pronunciation: "r3",
                explanation: "Sukun/Shaddah pattern: r3",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_r3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "s1",
                pronunciation: "s1",
                explanation: "Sukun/Shaddah pattern: s1",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_s1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "s2",
                pronunciation: "s2",
                explanation: "Sukun/Shaddah pattern: s2",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_s2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "s3",
                pronunciation: "s3",
                explanation: "Sukun/Shaddah pattern: s3",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_s3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "sh1",
                pronunciation: "sh1",
                explanation: "Sukun/Shaddah pattern: sh1",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_sh1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "sh2",
                pronunciation: "sh2",
                explanation: "Sukun/Shaddah pattern: sh2",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_sh2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "sh3",
                pronunciation: "sh3",
                explanation: "Sukun/Shaddah pattern: sh3",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_sh3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "ss1",
                pronunciation: "ss1",
                explanation: "Sukun/Shaddah pattern: ss1",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_ss1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "ss2",
                pronunciation: "ss2",
                explanation: "Sukun/Shaddah pattern: ss2",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_ss2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "ss3",
                pronunciation: "ss3",
                explanation: "Sukun/Shaddah pattern: ss3",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_ss3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "t1",
                pronunciation: "t1",
                explanation: "Sukun/Shaddah pattern: t1",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_t1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "t2",
                pronunciation: "t2",
                explanation: "Sukun/Shaddah pattern: t2",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_t2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "t3",
                pronunciation: "t3",
                explanation: "Sukun/Shaddah pattern: t3",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_t3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "tha1",
                pronunciation: "tha1",
                explanation: "Sukun/Shaddah pattern: tha1",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_tha1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "tha2",
                pronunciation: "tha2",
                explanation: "Sukun/Shaddah pattern: tha2",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_tha2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "tha3",
                pronunciation: "tha3",
                explanation: "Sukun/Shaddah pattern: tha3",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_tha3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "title",
                pronunciation: "title",
                explanation: "Sukun/Shaddah pattern: title",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_title.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "tt1",
                pronunciation: "tt1",
                explanation: "Sukun/Shaddah pattern: tt1",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_tt1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "tt2",
                pronunciation: "tt2",
                explanation: "Sukun/Shaddah pattern: tt2",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_tt2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "tt3",
                pronunciation: "tt3",
                explanation: "Sukun/Shaddah pattern: tt3",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_tt3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "y1",
                pronunciation: "y1",
                explanation: "Sukun/Shaddah pattern: y1",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_y1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "y2",
                pronunciation: "y2",
                explanation: "Sukun/Shaddah pattern: y2",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_y2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "y3",
                pronunciation: "y3",
                explanation: "Sukun/Shaddah pattern: y3",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_y3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "za1",
                pronunciation: "za1",
                explanation: "Sukun/Shaddah pattern: za1",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_za1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "za2",
                pronunciation: "za2",
                explanation: "Sukun/Shaddah pattern: za2",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_za2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "za3",
                pronunciation: "za3",
                explanation: "Sukun/Shaddah pattern: za3",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_za3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "zal1",
                pronunciation: "zal1",
                explanation: "Sukun/Shaddah pattern: zal1",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_zal1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "zal2",
                pronunciation: "zal2",
                explanation: "Sukun/Shaddah pattern: zal2",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_zal2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "zal3",
                pronunciation: "zal3",
                explanation: "Sukun/Shaddah pattern: zal3",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_zal3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "zza1",
                pronunciation: "zza1",
                explanation: "Sukun/Shaddah pattern: zza1",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_zza1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "zza2",
                pronunciation: "zza2",
                explanation: "Sukun/Shaddah pattern: zza2",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_zza2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "zza3",
                pronunciation: "zza3",
                explanation: "Sukun/Shaddah pattern: zza3",
                hint: "Advanced rules",
                audio: "audio/sukun_shaddah/p5_zza3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "b1",
                pronunciation: "b1",
                explanation: "Sukun/Shaddah pattern: b1",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_b1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "b2",
                pronunciation: "b2",
                explanation: "Sukun/Shaddah pattern: b2",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_b2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "b3",
                pronunciation: "b3",
                explanation: "Sukun/Shaddah pattern: b3",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_b3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "bn1",
                pronunciation: "bn1",
                explanation: "Sukun/Shaddah pattern: bn1",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_bn1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "bn2",
                pronunciation: "bn2",
                explanation: "Sukun/Shaddah pattern: bn2",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_bn2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "bn3",
                pronunciation: "bn3",
                explanation: "Sukun/Shaddah pattern: bn3",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_bn3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "d1",
                pronunciation: "d1",
                explanation: "Sukun/Shaddah pattern: d1",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_d1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "d2",
                pronunciation: "d2",
                explanation: "Sukun/Shaddah pattern: d2",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_d2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "d3",
                pronunciation: "d3",
                explanation: "Sukun/Shaddah pattern: d3",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_d3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "dd1",
                pronunciation: "dd1",
                explanation: "Sukun/Shaddah pattern: dd1",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_dd1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "dd2",
                pronunciation: "dd2",
                explanation: "Sukun/Shaddah pattern: dd2",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_dd2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "dd3",
                pronunciation: "dd3",
                explanation: "Sukun/Shaddah pattern: dd3",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_dd3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "f1",
                pronunciation: "f1",
                explanation: "Sukun/Shaddah pattern: f1",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_f1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "f2",
                pronunciation: "f2",
                explanation: "Sukun/Shaddah pattern: f2",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_f2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "f3",
                pronunciation: "f3",
                explanation: "Sukun/Shaddah pattern: f3",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_f3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "fn1",
                pronunciation: "fn1",
                explanation: "Sukun/Shaddah pattern: fn1",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_fn1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "fn2",
                pronunciation: "fn2",
                explanation: "Sukun/Shaddah pattern: fn2",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_fn2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "fn3",
                pronunciation: "fn3",
                explanation: "Sukun/Shaddah pattern: fn3",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_fn3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "g1",
                pronunciation: "g1",
                explanation: "Sukun/Shaddah pattern: g1",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_g1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "g2",
                pronunciation: "g2",
                explanation: "Sukun/Shaddah pattern: g2",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_g2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "g3",
                pronunciation: "g3",
                explanation: "Sukun/Shaddah pattern: g3",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_g3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "k1",
                pronunciation: "k1",
                explanation: "Sukun/Shaddah pattern: k1",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_k1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "k2",
                pronunciation: "k2",
                explanation: "Sukun/Shaddah pattern: k2",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_k2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "k3",
                pronunciation: "k3",
                explanation: "Sukun/Shaddah pattern: k3",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_k3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "l1",
                pronunciation: "l1",
                explanation: "Sukun/Shaddah pattern: l1",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_l1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "l2",
                pronunciation: "l2",
                explanation: "Sukun/Shaddah pattern: l2",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_l2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "l3",
                pronunciation: "l3",
                explanation: "Sukun/Shaddah pattern: l3",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_l3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "m1",
                pronunciation: "m1",
                explanation: "Sukun/Shaddah pattern: m1",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_m1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "m2",
                pronunciation: "m2",
                explanation: "Sukun/Shaddah pattern: m2",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_m2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "m3",
                pronunciation: "m3",
                explanation: "Sukun/Shaddah pattern: m3",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_m3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "mn1",
                pronunciation: "mn1",
                explanation: "Sukun/Shaddah pattern: mn1",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_mn1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "mn2",
                pronunciation: "mn2",
                explanation: "Sukun/Shaddah pattern: mn2",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_mn2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "mn3",
                pronunciation: "mn3",
                explanation: "Sukun/Shaddah pattern: mn3",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_mn3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "n1",
                pronunciation: "n1",
                explanation: "Sukun/Shaddah pattern: n1",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_n1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "n2",
                pronunciation: "n2",
                explanation: "Sukun/Shaddah pattern: n2",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_n2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "n3",
                pronunciation: "n3",
                explanation: "Sukun/Shaddah pattern: n3",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_n3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "q1",
                pronunciation: "q1",
                explanation: "Sukun/Shaddah pattern: q1",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_q1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "r1",
                pronunciation: "r1",
                explanation: "Sukun/Shaddah pattern: r1",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_r1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "r2",
                pronunciation: "r2",
                explanation: "Sukun/Shaddah pattern: r2",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_r2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "r3",
                pronunciation: "r3",
                explanation: "Sukun/Shaddah pattern: r3",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_r3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "s1",
                pronunciation: "s1",
                explanation: "Sukun/Shaddah pattern: s1",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_s1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "s2",
                pronunciation: "s2",
                explanation: "Sukun/Shaddah pattern: s2",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_s2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "s3",
                pronunciation: "s3",
                explanation: "Sukun/Shaddah pattern: s3",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_s3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "sh1",
                pronunciation: "sh1",
                explanation: "Sukun/Shaddah pattern: sh1",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_sh1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "sh2",
                pronunciation: "sh2",
                explanation: "Sukun/Shaddah pattern: sh2",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_sh2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "sh3",
                pronunciation: "sh3",
                explanation: "Sukun/Shaddah pattern: sh3",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_sh3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "ss1",
                pronunciation: "ss1",
                explanation: "Sukun/Shaddah pattern: ss1",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_ss1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "ss2",
                pronunciation: "ss2",
                explanation: "Sukun/Shaddah pattern: ss2",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_ss2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "ss3",
                pronunciation: "ss3",
                explanation: "Sukun/Shaddah pattern: ss3",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_ss3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "t1",
                pronunciation: "t1",
                explanation: "Sukun/Shaddah pattern: t1",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_t1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "t2",
                pronunciation: "t2",
                explanation: "Sukun/Shaddah pattern: t2",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_t2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "t3",
                pronunciation: "t3",
                explanation: "Sukun/Shaddah pattern: t3",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_t3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "tha1",
                pronunciation: "tha1",
                explanation: "Sukun/Shaddah pattern: tha1",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_tha1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "tha2",
                pronunciation: "tha2",
                explanation: "Sukun/Shaddah pattern: tha2",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_tha2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "tha3",
                pronunciation: "tha3",
                explanation: "Sukun/Shaddah pattern: tha3",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_tha3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "title",
                pronunciation: "title",
                explanation: "Sukun/Shaddah pattern: title",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_title.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "tt1",
                pronunciation: "tt1",
                explanation: "Sukun/Shaddah pattern: tt1",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_tt1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "tt2",
                pronunciation: "tt2",
                explanation: "Sukun/Shaddah pattern: tt2",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_tt2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "tt3",
                pronunciation: "tt3",
                explanation: "Sukun/Shaddah pattern: tt3",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_tt3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "w1",
                pronunciation: "w1",
                explanation: "Sukun/Shaddah pattern: w1",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_w1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "w2",
                pronunciation: "w2",
                explanation: "Sukun/Shaddah pattern: w2",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_w2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "w3",
                pronunciation: "w3",
                explanation: "Sukun/Shaddah pattern: w3",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_w3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "wn1",
                pronunciation: "wn1",
                explanation: "Sukun/Shaddah pattern: wn1",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_wn1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "wn2",
                pronunciation: "wn2",
                explanation: "Sukun/Shaddah pattern: wn2",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_wn2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "wn3",
                pronunciation: "wn3",
                explanation: "Sukun/Shaddah pattern: wn3",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_wn3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "y1",
                pronunciation: "y1",
                explanation: "Sukun/Shaddah pattern: y1",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_y1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "y2",
                pronunciation: "y2",
                explanation: "Sukun/Shaddah pattern: y2",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_y2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "y3",
                pronunciation: "y3",
                explanation: "Sukun/Shaddah pattern: y3",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_y3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "za1",
                pronunciation: "za1",
                explanation: "Sukun/Shaddah pattern: za1",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_za1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "za2",
                pronunciation: "za2",
                explanation: "Sukun/Shaddah pattern: za2",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_za2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "za3",
                pronunciation: "za3",
                explanation: "Sukun/Shaddah pattern: za3",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_za3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "zal1",
                pronunciation: "zal1",
                explanation: "Sukun/Shaddah pattern: zal1",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_zal1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "zal2",
                pronunciation: "zal2",
                explanation: "Sukun/Shaddah pattern: zal2",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_zal2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "zal3",
                pronunciation: "zal3",
                explanation: "Sukun/Shaddah pattern: zal3",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_zal3.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "zza1",
                pronunciation: "zza1",
                explanation: "Sukun/Shaddah pattern: zza1",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_zza1.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "zza2",
                pronunciation: "zza2",
                explanation: "Sukun/Shaddah pattern: zza2",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_zza2.mp3"
            },
            {
                arabic: "سكون/شدة",
                transliteration: "zza3",
                pronunciation: "zza3",
                explanation: "Sukun/Shaddah pattern: zza3",
                hint: "Advanced rules",
                audio: "audio/tanween/p6_zza3.mp3"
            },
        ]
    },
    7: {
        title: "Lesson 7: Basic Arabic Words (P12 Series)",
        description: "Learn your first 57 Arabic words with pronunciation",
        cards: [
            {
                arabic: "كَلِمَة 10",
                transliteration: "kalima 10",
                pronunciation: "word 10",
                explanation: "Arabic word 10 from traditional Norani sequence",
                hint: "Basic vocabulary word 10",
                audio: "audio/words/p12_word10.mp3"
            },
            {
                arabic: "كَلِمَة 11",
                transliteration: "kalima 11",
                pronunciation: "word 11",
                explanation: "Arabic word 11 from traditional Norani sequence",
                hint: "Basic vocabulary word 11",
                audio: "audio/words/p12_word11.mp3"
            },
            {
                arabic: "كَلِمَة 12",
                transliteration: "kalima 12",
                pronunciation: "word 12",
                explanation: "Arabic word 12 from traditional Norani sequence",
                hint: "Basic vocabulary word 12",
                audio: "audio/words/p12_word12.mp3"
            },
            {
                arabic: "كَلِمَة 13",
                transliteration: "kalima 13",
                pronunciation: "word 13",
                explanation: "Arabic word 13 from traditional Norani sequence",
                hint: "Basic vocabulary word 13",
                audio: "audio/words/p12_word13.mp3"
            },
            {
                arabic: "كَلِمَة 14",
                transliteration: "kalima 14",
                pronunciation: "word 14",
                explanation: "Arabic word 14 from traditional Norani sequence",
                hint: "Basic vocabulary word 14",
                audio: "audio/words/p12_word14.mp3"
            },
            {
                arabic: "كَلِمَة 15",
                transliteration: "kalima 15",
                pronunciation: "word 15",
                explanation: "Arabic word 15 from traditional Norani sequence",
                hint: "Basic vocabulary word 15",
                audio: "audio/words/p12_word15.mp3"
            },
            {
                arabic: "كَلِمَة 16",
                transliteration: "kalima 16",
                pronunciation: "word 16",
                explanation: "Arabic word 16 from traditional Norani sequence",
                hint: "Basic vocabulary word 16",
                audio: "audio/words/p12_word16.mp3"
            },
            {
                arabic: "كَلِمَة 17",
                transliteration: "kalima 17",
                pronunciation: "word 17",
                explanation: "Arabic word 17 from traditional Norani sequence",
                hint: "Basic vocabulary word 17",
                audio: "audio/words/p12_word17.mp3"
            },
            {
                arabic: "كَلِمَة 18",
                transliteration: "kalima 18",
                pronunciation: "word 18",
                explanation: "Arabic word 18 from traditional Norani sequence",
                hint: "Basic vocabulary word 18",
                audio: "audio/words/p12_word18.mp3"
            },
            {
                arabic: "كَلِمَة 19",
                transliteration: "kalima 19",
                pronunciation: "word 19",
                explanation: "Arabic word 19 from traditional Norani sequence",
                hint: "Basic vocabulary word 19",
                audio: "audio/words/p12_word19.mp3"
            },
            {
                arabic: "كَلِمَة 1",
                transliteration: "kalima 1",
                pronunciation: "word 1",
                explanation: "Arabic word 1 from traditional Norani sequence",
                hint: "Basic vocabulary word 1",
                audio: "audio/words/p12_word1.mp3"
            },
            {
                arabic: "كَلِمَة 20",
                transliteration: "kalima 20",
                pronunciation: "word 20",
                explanation: "Arabic word 20 from traditional Norani sequence",
                hint: "Basic vocabulary word 20",
                audio: "audio/words/p12_word20.mp3"
            },
            {
                arabic: "كَلِمَة 21",
                transliteration: "kalima 21",
                pronunciation: "word 21",
                explanation: "Arabic word 21 from traditional Norani sequence",
                hint: "Basic vocabulary word 21",
                audio: "audio/words/p12_word21.mp3"
            },
            {
                arabic: "كَلِمَة 22",
                transliteration: "kalima 22",
                pronunciation: "word 22",
                explanation: "Arabic word 22 from traditional Norani sequence",
                hint: "Basic vocabulary word 22",
                audio: "audio/words/p12_word22.mp3"
            },
            {
                arabic: "كَلِمَة 23",
                transliteration: "kalima 23",
                pronunciation: "word 23",
                explanation: "Arabic word 23 from traditional Norani sequence",
                hint: "Basic vocabulary word 23",
                audio: "audio/words/p12_word23.mp3"
            },
            {
                arabic: "كَلِمَة 24",
                transliteration: "kalima 24",
                pronunciation: "word 24",
                explanation: "Arabic word 24 from traditional Norani sequence",
                hint: "Basic vocabulary word 24",
                audio: "audio/words/p12_word24.mp3"
            },
            {
                arabic: "كَلِمَة 25",
                transliteration: "kalima 25",
                pronunciation: "word 25",
                explanation: "Arabic word 25 from traditional Norani sequence",
                hint: "Basic vocabulary word 25",
                audio: "audio/words/p12_word25.mp3"
            },
            {
                arabic: "كَلِمَة 26",
                transliteration: "kalima 26",
                pronunciation: "word 26",
                explanation: "Arabic word 26 from traditional Norani sequence",
                hint: "Basic vocabulary word 26",
                audio: "audio/words/p12_word26.mp3"
            },
            {
                arabic: "كَلِمَة 27",
                transliteration: "kalima 27",
                pronunciation: "word 27",
                explanation: "Arabic word 27 from traditional Norani sequence",
                hint: "Basic vocabulary word 27",
                audio: "audio/words/p12_word27.mp3"
            },
            {
                arabic: "كَلِمَة 28",
                transliteration: "kalima 28",
                pronunciation: "word 28",
                explanation: "Arabic word 28 from traditional Norani sequence",
                hint: "Basic vocabulary word 28",
                audio: "audio/words/p12_word28.mp3"
            },
            {
                arabic: "كَلِمَة 29",
                transliteration: "kalima 29",
                pronunciation: "word 29",
                explanation: "Arabic word 29 from traditional Norani sequence",
                hint: "Basic vocabulary word 29",
                audio: "audio/words/p12_word29.mp3"
            },
            {
                arabic: "كَلِمَة 2",
                transliteration: "kalima 2",
                pronunciation: "word 2",
                explanation: "Arabic word 2 from traditional Norani sequence",
                hint: "Basic vocabulary word 2",
                audio: "audio/words/p12_word2.mp3"
            },
            {
                arabic: "كَلِمَة 30",
                transliteration: "kalima 30",
                pronunciation: "word 30",
                explanation: "Arabic word 30 from traditional Norani sequence",
                hint: "Basic vocabulary word 30",
                audio: "audio/words/p12_word30.mp3"
            },
            {
                arabic: "كَلِمَة 31",
                transliteration: "kalima 31",
                pronunciation: "word 31",
                explanation: "Arabic word 31 from traditional Norani sequence",
                hint: "Basic vocabulary word 31",
                audio: "audio/words/p12_word31.mp3"
            },
            {
                arabic: "كَلِمَة 32",
                transliteration: "kalima 32",
                pronunciation: "word 32",
                explanation: "Arabic word 32 from traditional Norani sequence",
                hint: "Basic vocabulary word 32",
                audio: "audio/words/p12_word32.mp3"
            },
            {
                arabic: "كَلِمَة 33",
                transliteration: "kalima 33",
                pronunciation: "word 33",
                explanation: "Arabic word 33 from traditional Norani sequence",
                hint: "Basic vocabulary word 33",
                audio: "audio/words/p12_word33.mp3"
            },
            {
                arabic: "كَلِمَة 34",
                transliteration: "kalima 34",
                pronunciation: "word 34",
                explanation: "Arabic word 34 from traditional Norani sequence",
                hint: "Basic vocabulary word 34",
                audio: "audio/words/p12_word34.mp3"
            },
            {
                arabic: "كَلِمَة 35",
                transliteration: "kalima 35",
                pronunciation: "word 35",
                explanation: "Arabic word 35 from traditional Norani sequence",
                hint: "Basic vocabulary word 35",
                audio: "audio/words/p12_word35.mp3"
            },
            {
                arabic: "كَلِمَة 36",
                transliteration: "kalima 36",
                pronunciation: "word 36",
                explanation: "Arabic word 36 from traditional Norani sequence",
                hint: "Basic vocabulary word 36",
                audio: "audio/words/p12_word36.mp3"
            },
            {
                arabic: "كَلِمَة 37",
                transliteration: "kalima 37",
                pronunciation: "word 37",
                explanation: "Arabic word 37 from traditional Norani sequence",
                hint: "Basic vocabulary word 37",
                audio: "audio/words/p12_word37.mp3"
            },
            {
                arabic: "كَلِمَة 38",
                transliteration: "kalima 38",
                pronunciation: "word 38",
                explanation: "Arabic word 38 from traditional Norani sequence",
                hint: "Basic vocabulary word 38",
                audio: "audio/words/p12_word38.mp3"
            },
            {
                arabic: "كَلِمَة 39",
                transliteration: "kalima 39",
                pronunciation: "word 39",
                explanation: "Arabic word 39 from traditional Norani sequence",
                hint: "Basic vocabulary word 39",
                audio: "audio/words/p12_word39.mp3"
            },
            {
                arabic: "كَلِمَة 3",
                transliteration: "kalima 3",
                pronunciation: "word 3",
                explanation: "Arabic word 3 from traditional Norani sequence",
                hint: "Basic vocabulary word 3",
                audio: "audio/words/p12_word3.mp3"
            },
            {
                arabic: "كَلِمَة 40",
                transliteration: "kalima 40",
                pronunciation: "word 40",
                explanation: "Arabic word 40 from traditional Norani sequence",
                hint: "Basic vocabulary word 40",
                audio: "audio/words/p12_word40.mp3"
            },
            {
                arabic: "كَلِمَة 41",
                transliteration: "kalima 41",
                pronunciation: "word 41",
                explanation: "Arabic word 41 from traditional Norani sequence",
                hint: "Basic vocabulary word 41",
                audio: "audio/words/p12_word41.mp3"
            },
            {
                arabic: "كَلِمَة 42",
                transliteration: "kalima 42",
                pronunciation: "word 42",
                explanation: "Arabic word 42 from traditional Norani sequence",
                hint: "Basic vocabulary word 42",
                audio: "audio/words/p12_word42.mp3"
            },
            {
                arabic: "كَلِمَة 43",
                transliteration: "kalima 43",
                pronunciation: "word 43",
                explanation: "Arabic word 43 from traditional Norani sequence",
                hint: "Basic vocabulary word 43",
                audio: "audio/words/p12_word43.mp3"
            },
            {
                arabic: "كَلِمَة 44",
                transliteration: "kalima 44",
                pronunciation: "word 44",
                explanation: "Arabic word 44 from traditional Norani sequence",
                hint: "Basic vocabulary word 44",
                audio: "audio/words/p12_word44.mp3"
            },
            {
                arabic: "كَلِمَة 45",
                transliteration: "kalima 45",
                pronunciation: "word 45",
                explanation: "Arabic word 45 from traditional Norani sequence",
                hint: "Basic vocabulary word 45",
                audio: "audio/words/p12_word45.mp3"
            },
            {
                arabic: "كَلِمَة 46",
                transliteration: "kalima 46",
                pronunciation: "word 46",
                explanation: "Arabic word 46 from traditional Norani sequence",
                hint: "Basic vocabulary word 46",
                audio: "audio/words/p12_word46.mp3"
            },
            {
                arabic: "كَلِمَة 47",
                transliteration: "kalima 47",
                pronunciation: "word 47",
                explanation: "Arabic word 47 from traditional Norani sequence",
                hint: "Basic vocabulary word 47",
                audio: "audio/words/p12_word47.mp3"
            },
            {
                arabic: "كَلِمَة 48",
                transliteration: "kalima 48",
                pronunciation: "word 48",
                explanation: "Arabic word 48 from traditional Norani sequence",
                hint: "Basic vocabulary word 48",
                audio: "audio/words/p12_word48.mp3"
            },
            {
                arabic: "كَلِمَة 49",
                transliteration: "kalima 49",
                pronunciation: "word 49",
                explanation: "Arabic word 49 from traditional Norani sequence",
                hint: "Basic vocabulary word 49",
                audio: "audio/words/p12_word49.mp3"
            },
            {
                arabic: "كَلِمَة 4",
                transliteration: "kalima 4",
                pronunciation: "word 4",
                explanation: "Arabic word 4 from traditional Norani sequence",
                hint: "Basic vocabulary word 4",
                audio: "audio/words/p12_word4.mp3"
            },
            {
                arabic: "كَلِمَة 50",
                transliteration: "kalima 50",
                pronunciation: "word 50",
                explanation: "Arabic word 50 from traditional Norani sequence",
                hint: "Basic vocabulary word 50",
                audio: "audio/words/p12_word50.mp3"
            },
            {
                arabic: "كَلِمَة 51",
                transliteration: "kalima 51",
                pronunciation: "word 51",
                explanation: "Arabic word 51 from traditional Norani sequence",
                hint: "Basic vocabulary word 51",
                audio: "audio/words/p12_word51.mp3"
            },
            {
                arabic: "كَلِمَة 52",
                transliteration: "kalima 52",
                pronunciation: "word 52",
                explanation: "Arabic word 52 from traditional Norani sequence",
                hint: "Basic vocabulary word 52",
                audio: "audio/words/p12_word52.mp3"
            },
            {
                arabic: "كَلِمَة 53",
                transliteration: "kalima 53",
                pronunciation: "word 53",
                explanation: "Arabic word 53 from traditional Norani sequence",
                hint: "Basic vocabulary word 53",
                audio: "audio/words/p12_word53.mp3"
            },
            {
                arabic: "كَلِمَة 54",
                transliteration: "kalima 54",
                pronunciation: "word 54",
                explanation: "Arabic word 54 from traditional Norani sequence",
                hint: "Basic vocabulary word 54",
                audio: "audio/words/p12_word54.mp3"
            },
            {
                arabic: "كَلِمَة 55",
                transliteration: "kalima 55",
                pronunciation: "word 55",
                explanation: "Arabic word 55 from traditional Norani sequence",
                hint: "Basic vocabulary word 55",
                audio: "audio/words/p12_word55.mp3"
            },
            {
                arabic: "كَلِمَة 56",
                transliteration: "kalima 56",
                pronunciation: "word 56",
                explanation: "Arabic word 56 from traditional Norani sequence",
                hint: "Basic vocabulary word 56",
                audio: "audio/words/p12_word56.mp3"
            },
            {
                arabic: "كَلِمَة 57",
                transliteration: "kalima 57",
                pronunciation: "word 57",
                explanation: "Arabic word 57 from traditional Norani sequence",
                hint: "Basic vocabulary word 57",
                audio: "audio/words/p12_word57.mp3"
            },
            {
                arabic: "كَلِمَة 5",
                transliteration: "kalima 5",
                pronunciation: "word 5",
                explanation: "Arabic word 5 from traditional Norani sequence",
                hint: "Basic vocabulary word 5",
                audio: "audio/words/p12_word5.mp3"
            },
            {
                arabic: "كَلِمَة 6",
                transliteration: "kalima 6",
                pronunciation: "word 6",
                explanation: "Arabic word 6 from traditional Norani sequence",
                hint: "Basic vocabulary word 6",
                audio: "audio/words/p12_word6.mp3"
            },
            {
                arabic: "كَلِمَة 7",
                transliteration: "kalima 7",
                pronunciation: "word 7",
                explanation: "Arabic word 7 from traditional Norani sequence",
                hint: "Basic vocabulary word 7",
                audio: "audio/words/p12_word7.mp3"
            },
            {
                arabic: "كَلِمَة 8",
                transliteration: "kalima 8",
                pronunciation: "word 8",
                explanation: "Arabic word 8 from traditional Norani sequence",
                hint: "Basic vocabulary word 8",
                audio: "audio/words/p12_word8.mp3"
            },
            {
                arabic: "كَلِمَة 9",
                transliteration: "kalima 9",
                pronunciation: "word 9",
                explanation: "Arabic word 9 from traditional Norani sequence",
                hint: "Basic vocabulary word 9",
                audio: "audio/words/p12_word9.mp3"
            },
        ]
    }
};
