// Norani Qaida Flashcards Data - Updated with Comprehensive Audio Mapping
const flashcardsData = {
    1: {
        title: "Lesson 1: Individual Letters (الحروف المفردة)",
        description: "Learn the 28 Arabic letters in their isolated form",
        cards: [
            {
                arabic: "ا",
                transliteration: "Alif",
                pronunciation: "aa",
                explanation: "The first letter of the Arabic alphabet. Makes a long 'aa' sound.",
                hint: "Looks like a straight line",
                audio: "audio/letters/alif.mp3"
            },
            {
                arabic: "ب",
                transliteration: "Baa",
                pronunciation: "b",
                explanation: "Second letter. Makes a 'b' sound like in 'book'.",
                hint: "Has one dot below",
                audio: "audio/letters/baa.mp3"
            },
            {
                arabic: "ت",
                transliteration: "Taa",
                pronunciation: "t",
                explanation: "Third letter. Makes a 't' sound like in 'top'.",
                hint: "Has two dots above",
                audio: "audio/letters/taa.mp3"
            },
            {
                arabic: "ث",
                transliteration: "Thaa",
                pronunciation: "th",
                explanation: "Fourth letter. Makes a 'th' sound like in 'think'.",
                hint: "Has three dots above",
                audio: "audio/letters/thaa.mp3"
            },
            {
                arabic: "ج",
                transliteration: "Jeem",
                pronunciation: "j",
                explanation: "Fifth letter. Makes a 'j' sound like in 'jump'.",
                hint: "Has one dot below",
                audio: "audio/letters/jeem.mp3"
            },
            {
                arabic: "ح",
                transliteration: "Haa",
                pronunciation: "h",
                explanation: "Sixth letter. Makes a breathy 'h' sound from the throat.",
                hint: "No dots, curved shape",
                audio: "audio/letters/haa.mp3"
            },
            {
                arabic: "خ",
                transliteration: "Khaa",
                pronunciation: "kh",
                explanation: "Seventh letter. Makes a 'kh' sound like clearing throat.",
                hint: "Has one dot above",
                audio: "audio/letters/khaa.mp3"
            },
            {
                arabic: "د",
                transliteration: "Daal",
                pronunciation: "d",
                explanation: "Eighth letter. Makes a 'd' sound like in 'door'.",
                hint: "No dots, curved at top",
                audio: "audio/letters/daal.mp3"
            },
            {
                arabic: "ذ",
                transliteration: "Dhaal",
                pronunciation: "dh",
                explanation: "Ninth letter. Makes a 'th' sound like in 'this'.",
                hint: "Has one dot above",
                audio: "audio/letters/dhaal.mp3"
            },
            {
                arabic: "ر",
                transliteration: "Raa",
                pronunciation: "r",
                explanation: "Tenth letter. Makes a rolled 'r' sound.",
                hint: "No dots, curved hook",
                audio: "audio/letters/raa.mp3"
            },
            {
                arabic: "ز",
                transliteration: "Zaay",
                pronunciation: "z",
                explanation: "Eleventh letter. Makes a 'z' sound like in 'zoo'.",
                hint: "Has one dot above",
                audio: "audio/letters/zaay.mp3"
            },
            {
                arabic: "س",
                transliteration: "Seen",
                pronunciation: "s",
                explanation: "Twelfth letter. Makes an 's' sound like in 'sun'.",
                hint: "Has three teeth, no dots",
                audio: "audio/letters/seen.mp3"
            },
            {
                arabic: "ش",
                transliteration: "Sheen",
                pronunciation: "sh",
                explanation: "Thirteenth letter. Makes a 'sh' sound like in 'ship'.",
                hint: "Has three teeth and three dots above",
                audio: "audio/letters/sheen.mp3"
            },
            {
                arabic: "ص",
                transliteration: "Saad",
                pronunciation: "s",
                explanation: "Fourteenth letter. Makes an emphatic 's' sound.",
                hint: "Curved with no dots",
                audio: "audio/letters/saad.mp3"
            },
            {
                arabic: "ض",
                transliteration: "Daad",
                pronunciation: "d",
                explanation: "Fifteenth letter. Makes an emphatic 'd' sound.",
                hint: "Has one dot above",
                audio: "audio/letters/daad.mp3"
            },
            {
                arabic: "ط",
                transliteration: "Taa",
                pronunciation: "t",
                explanation: "Sixteenth letter. Makes an emphatic 't' sound.",
                hint: "Curved with no dots",
                audio: "audio/letters/taa_emphatic.mp3"
            },
            {
                arabic: "ظ",
                transliteration: "Dhaa",
                pronunciation: "dh",
                explanation: "Seventeenth letter. Makes an emphatic 'th' sound.",
                hint: "Has one dot above",
                audio: "audio/letters/dhaa_emphatic.mp3"
            },
            {
                arabic: "ع",
                transliteration: "Ayn",
                pronunciation: "'a",
                explanation: "Eighteenth letter. Makes a deep throat sound.",
                hint: "Curved opening, no dots",
                audio: "audio/letters/ayn.mp3"
            },
            {
                arabic: "غ",
                transliteration: "Ghayn",
                pronunciation: "gh",
                explanation: "Nineteenth letter. Makes a gargling 'gh' sound.",
                hint: "Has one dot above",
                audio: "audio/letters/ghayn.mp3"
            },
            {
                arabic: "ف",
                transliteration: "Faa",
                pronunciation: "f",
                explanation: "Twentieth letter. Makes an 'f' sound like in 'fish'.",
                hint: "Has one dot above",
                audio: "audio/letters/faa.mp3"
            },
            {
                arabic: "ق",
                transliteration: "Qaaf",
                pronunciation: "q",
                explanation: "Twenty-first letter. Makes a deep 'q' sound from throat.",
                hint: "Has two dots above",
                audio: "audio/letters/qaaf.mp3"
            },
            {
                arabic: "ك",
                transliteration: "Kaaf",
                pronunciation: "k",
                explanation: "Twenty-second letter. Makes a 'k' sound like in 'key'.",
                hint: "No dots, has a small tooth",
                audio: "audio/letters/kaaf.mp3"
            },
            {
                arabic: "ل",
                transliteration: "Laam",
                pronunciation: "l",
                explanation: "Twenty-third letter. Makes an 'l' sound like in 'love'.",
                hint: "No dots, tall and curved",
                audio: "audio/letters/laam.mp3"
            },
            {
                arabic: "م",
                transliteration: "Meem",
                pronunciation: "m",
                explanation: "Twenty-fourth letter. Makes an 'm' sound like in 'moon'.",
                hint: "No dots, circular shape",
                audio: "audio/letters/meem.mp3"
            },
            {
                arabic: "ن",
                transliteration: "Noon",
                pronunciation: "n",
                explanation: "Twenty-fifth letter. Makes an 'n' sound like in 'name'.",
                hint: "Has one dot above",
                audio: "audio/letters/noon.mp3"
            },
            {
                arabic: "ه",
                transliteration: "Haa",
                pronunciation: "h",
                explanation: "Twenty-sixth letter. Makes a soft 'h' sound.",
                hint: "No dots, oval shape",
                audio: "audio/letters/haa_soft.mp3"
            },
            {
                arabic: "و",
                transliteration: "Waaw",
                pronunciation: "w/oo",
                explanation: "Twenty-seventh letter. Makes 'w' or long 'oo' sound.",
                hint: "No dots, curved like a hook",
                audio: "audio/letters/waaw.mp3"
            },
            {
                arabic: "ي",
                transliteration: "Yaa",
                pronunciation: "y/ee",
                explanation: "Twenty-eighth letter. Makes 'y' or long 'ee' sound.",
                hint: "Has two dots below",
                audio: "audio/letters/yaa.mp3"
            }
        ]
    },
    2: {
        title: "Lesson 2: Letter Combinations (تركيب الحروف)",
        description: "Practice reading letters joined together",
        cards: [
            {
                arabic: "با",
                transliteration: "baa",
                pronunciation: "baa",
                explanation: "Baa + Alif. The letter ب connected to ا.",
                hint: "Two letters joined",
                audio: "audio/combinations/baa_alif.mp3"
            },
            {
                arabic: "تا",
                transliteration: "taa",
                pronunciation: "taa",
                explanation: "Taa + Alif. The letter ت connected to ا.",
                hint: "Two dots above + alif",
                audio: "audio/combinations/taa_alif.mp3"
            },
            {
                arabic: "ثا",
                transliteration: "thaa",
                pronunciation: "thaa",
                explanation: "Thaa + Alif. The letter ث connected to ا.",
                hint: "Three dots above + alif",
                audio: "audio/combinations/thaa_alif.mp3"
            },
            {
                arabic: "لا",
                transliteration: "laa",
                pronunciation: "laa",
                explanation: "Laam + Alif. Special combination لا.",
                hint: "Special joined form",
                audio: "audio/combinations/laam_alif.mp3"
            },
            {
                arabic: "بج",
                transliteration: "baj",
                pronunciation: "baj",
                explanation: "Baa + Jeem combination.",
                hint: "B + J sounds",
                audio: "audio/combinations/baa_jeem.mp3"
            },
            {
                arabic: "بم",
                transliteration: "bam",
                pronunciation: "bam",
                explanation: "Baa + Meem combination.",
                hint: "B + M sounds",
                audio: "audio/combinations/baa_meem.mp3"
            },
            {
                arabic: "بس",
                transliteration: "bas",
                pronunciation: "bas",
                explanation: "Baa + Seen combination.",
                hint: "B + S sounds",
                audio: "audio/combinations/baa_seen.mp3"
            },
            {
                arabic: "بي",
                transliteration: "bay",
                pronunciation: "bay",
                explanation: "Baa + Yaa combination.",
                hint: "B + Y sounds",
                audio: "audio/combinations/baa_yaa.mp3"
            }
        ]
    },
    3: {
        title: "Lesson 3: Short Vowels - Harakat (الحركات)",
        description: "Learn Fatha, Kasra, and Damma - the three short vowels",
        cards: [
            {
                arabic: "بَ",
                transliteration: "ba",
                pronunciation: "ba",
                explanation: "Baa with Fatha (َ). Makes 'ba' sound like in 'bat'.",
                hint: "Small line above = 'a' sound",
                audio: "audio/harakat/ba_fatha.mp3"
            },
            {
                arabic: "بِ",
                transliteration: "bi",
                pronunciation: "bi",
                explanation: "Baa with Kasra (ِ). Makes 'bi' sound like in 'bit'.",
                hint: "Small line below = 'i' sound",
                audio: "audio/harakat/bi_kasra.mp3"
            },
            {
                arabic: "بُ",
                transliteration: "bu",
                pronunciation: "bu",
                explanation: "Baa with Damma (ُ). Makes 'bu' sound like in 'book'.",
                hint: "Small curl above = 'u' sound",
                audio: "audio/harakat/bu_damma.mp3"
            },
            {
                arabic: "تَ",
                transliteration: "ta",
                pronunciation: "ta",
                explanation: "Taa with Fatha. Makes 'ta' sound.",
                hint: "Two dots + fatha",
                audio: "audio/harakat/ta_fatha.mp3"
            },
            {
                arabic: "تِ",
                transliteration: "ti",
                pronunciation: "ti",
                explanation: "Taa with Kasra. Makes 'ti' sound.",
                hint: "Two dots + kasra",
                audio: "audio/harakat/ti_kasra.mp3"
            },
            {
                arabic: "تُ",
                transliteration: "tu",
                pronunciation: "tu",
                explanation: "Taa with Damma. Makes 'tu' sound.",
                hint: "Two dots + damma",
                audio: "audio/harakat/tu_damma.mp3"
            },
            {
                arabic: "ثَ",
                transliteration: "tha",
                pronunciation: "tha",
                explanation: "Thaa with Fatha. Makes 'tha' sound.",
                hint: "Three dots + fatha",
                audio: "audio/harakat/tha_fatha.mp3"
            },
            {
                arabic: "ثِ",
                transliteration: "thi",
                pronunciation: "thi",
                explanation: "Thaa with Kasra. Makes 'thi' sound.",
                hint: "Three dots + kasra",
                audio: "audio/harakat/thi_kasra.mp3"
            },
            {
                arabic: "ثُ",
                transliteration: "thu",
                pronunciation: "thu",
                explanation: "Thaa with Damma. Makes 'thu' sound.",
                hint: "Three dots + damma",
                audio: "audio/harakat/thu_damma.mp3"
            },
            {
                arabic: "جَ",
                transliteration: "ja",
                pronunciation: "ja",
                explanation: "Jeem with Fatha. Makes 'ja' sound.",
                hint: "Curved letter + fatha",
                audio: "audio/harakat/ja_fatha.mp3"
            },
            {
                arabic: "جِ",
                transliteration: "ji",
                pronunciation: "ji",
                explanation: "Jeem with Kasra. Makes 'ji' sound.",
                hint: "Curved letter + kasra",
                audio: "audio/harakat/ji_kasra.mp3"
            },
            {
                arabic: "جُ",
                transliteration: "ju",
                pronunciation: "ju",
                explanation: "Jeem with Damma. Makes 'ju' sound.",
                hint: "Curved letter + damma",
                audio: "audio/harakat/ju_damma.mp3"
            },
            {
                arabic: "حَ",
                transliteration: "ha",
                pronunciation: "ha",
                explanation: "Haa with Fatha. Makes 'ha' sound.",
                hint: "No dots + fatha",
                audio: "audio/harakat/ha_fatha.mp3"
            },
            {
                arabic: "حِ",
                transliteration: "hi",
                pronunciation: "hi",
                explanation: "Haa with Kasra. Makes 'hi' sound.",
                hint: "No dots + kasra",
                audio: "audio/harakat/hi_kasra.mp3"
            },
            {
                arabic: "حُ",
                transliteration: "hu",
                pronunciation: "hu",
                explanation: "Haa with Damma. Makes 'hu' sound.",
                hint: "No dots + damma",
                audio: "audio/harakat/hu_damma.mp3"
            },
            {
                arabic: "خَ",
                transliteration: "kha",
                pronunciation: "kha",
                explanation: "Khaa with Fatha. Makes 'kha' sound.",
                hint: "One dot + fatha",
                audio: "audio/harakat/kha_fatha.mp3"
            },
            {
                arabic: "خِ",
                transliteration: "khi",
                pronunciation: "khi",
                explanation: "Khaa with Kasra. Makes 'khi' sound.",
                hint: "One dot + kasra",
                audio: "audio/harakat/khi_kasra.mp3"
            },
            {
                arabic: "خُ",
                transliteration: "khu",
                pronunciation: "khu",
                explanation: "Khaa with Damma. Makes 'khu' sound.",
                hint: "One dot + damma",
                audio: "audio/harakat/khu_damma.mp3"
            },
            {
                arabic: "سَ",
                transliteration: "sa",
                pronunciation: "sa",
                explanation: "Seen with Fatha. Makes 'sa' sound.",
                hint: "Three teeth + fatha",
                audio: "audio/harakat/sa_fatha.mp3"
            },
            {
                arabic: "سِ",
                transliteration: "si",
                pronunciation: "si",
                explanation: "Seen with Kasra. Makes 'si' sound.",
                hint: "Three teeth + kasra",
                audio: "audio/harakat/si_kasra.mp3"
            },
            {
                arabic: "سُ",
                transliteration: "su",
                pronunciation: "su",
                explanation: "Seen with Damma. Makes 'su' sound.",
                hint: "Three teeth + damma",
                audio: "audio/harakat/su_damma.mp3"
            },
            {
                arabic: "شَ",
                transliteration: "sha",
                pronunciation: "sha",
                explanation: "Sheen with Fatha. Makes 'sha' sound.",
                hint: "Three teeth + three dots + fatha",
                audio: "audio/harakat/sha_fatha.mp3"
            },
            {
                arabic: "شِ",
                transliteration: "shi",
                pronunciation: "shi",
                explanation: "Sheen with Kasra. Makes 'shi' sound.",
                hint: "Three teeth + three dots + kasra",
                audio: "audio/harakat/shi_kasra.mp3"
            },
            {
                arabic: "شُ",
                transliteration: "shu",
                pronunciation: "shu",
                explanation: "Sheen with Damma. Makes 'shu' sound.",
                hint: "Three teeth + three dots + damma",
                audio: "audio/harakat/shu_damma.mp3"
            }
        ]
    },
    4: {
        title: "Lesson 4: Long Vowels - Madd (المد)",
        description: "Learn long vowels using Alif, Waaw, and Yaa",
        cards: [
            {
                arabic: "با",
                transliteration: "baa",
                pronunciation: "baa",
                explanation: "Baa + Alif makes long 'aa' sound. Hold for 2 counts.",
                hint: "Long 'aa' sound",
                audio: "audio/madd/baa_long.mp3"
            },
            {
                arabic: "بو",
                transliteration: "boo",
                pronunciation: "boo",
                explanation: "Baa + Waaw makes long 'oo' sound. Hold for 2 counts.",
                hint: "Long 'oo' sound",
                audio: "audio/madd/boo_long.mp3"
            },
            {
                arabic: "بي",
                transliteration: "bee",
                pronunciation: "bee",
                explanation: "Baa + Yaa makes long 'ee' sound. Hold for 2 counts.",
                hint: "Long 'ee' sound",
                audio: "audio/madd/bee_long.mp3"
            },
            {
                arabic: "تا",
                transliteration: "taa",
                pronunciation: "taa",
                explanation: "Taa + Alif makes long 'aa' sound.",
                hint: "Two dots + long aa",
                audio: "audio/madd/taa_long.mp3"
            },
            {
                arabic: "تو",
                transliteration: "too",
                pronunciation: "too",
                explanation: "Taa + Waaw makes long 'oo' sound.",
                hint: "Two dots + long oo",
                audio: "audio/madd/too_long.mp3"
            },
            {
                arabic: "تي",
                transliteration: "tee",
                pronunciation: "tee",
                explanation: "Taa + Yaa makes long 'ee' sound.",
                hint: "Two dots + long ee",
                audio: "audio/madd/tee_long.mp3"
            },
            {
                arabic: "ثا",
                transliteration: "thaa",
                pronunciation: "thaa",
                explanation: "Thaa + Alif makes long 'aa' sound.",
                hint: "Three dots + long aa",
                audio: "audio/madd/thaa_long.mp3"
            },
            {
                arabic: "ثو",
                transliteration: "thoo",
                pronunciation: "thoo",
                explanation: "Thaa + Waaw makes long 'oo' sound.",
                hint: "Three dots + long oo",
                audio: "audio/madd/thoo_long.mp3"
            },
            {
                arabic: "ثي",
                transliteration: "thee",
                pronunciation: "thee",
                explanation: "Thaa + Yaa makes long 'ee' sound.",
                hint: "Three dots + long ee",
                audio: "audio/madd/thee_long.mp3"
            }
        ]
    },
    5: {
        title: "Lesson 5: Sukun & Shaddah (السكون والشدة)",
        description: "Learn Sukun (no vowel) and Shaddah (double letter)",
        cards: [
            {
                arabic: "بْ",
                transliteration: "b",
                pronunciation: "b",
                explanation: "Baa with Sukun (ْ). No vowel sound, just the consonant.",
                hint: "Small circle = no vowel",
                audio: "audio/sukun_shaddah/b_sukun.mp3"
            },
            {
                arabic: "تْ",
                transliteration: "t",
                pronunciation: "t",
                explanation: "Taa with Sukun. No vowel sound, just 't'.",
                hint: "Two dots + sukun",
                audio: "audio/sukun_shaddah/t_sukun.mp3"
            },
            {
                arabic: "ثْ",
                transliteration: "th",
                pronunciation: "th",
                explanation: "Thaa with Sukun. No vowel sound, just 'th'.",
                hint: "Three dots + sukun",
                audio: "audio/sukun_shaddah/th_sukun.mp3"
            },
            {
                arabic: "بَّ",
                transliteration: "bba",
                pronunciation: "bba",
                explanation: "Baa with Shaddah and Fatha (َّ). Double 'b' with 'a' sound.",
                hint: "W-shape = double letter",
                audio: "audio/sukun_shaddah/bba_shaddah.mp3"
            },
            {
                arabic: "تَّ",
                transliteration: "tta",
                pronunciation: "tta",
                explanation: "Taa with Shaddah and Fatha. Double 't' with 'a' sound.",
                hint: "Two dots + shaddah + fatha",
                audio: "audio/sukun_shaddah/tta_shaddah.mp3"
            },
            {
                arabic: "ثَّ",
                transliteration: "ththa",
                pronunciation: "ththa",
                explanation: "Thaa with Shaddah and Fatha. Double 'th' with 'a' sound.",
                hint: "Three dots + shaddah + fatha",
                audio: "audio/sukun_shaddah/ththa_shaddah.mp3"
            }
        ]
    },
    6: {
        title: "Lesson 6: Tanween (التنوين)",
        description: "Learn double short vowels - Tanween Fath, Kasr, and Damm",
        cards: [
            {
                arabic: "بً",
                transliteration: "ban",
                pronunciation: "ban",
                explanation: "Baa with Tanween Fath (ً). Makes 'ban' sound.",
                hint: "Double fatha = 'an' sound",
                audio: "audio/tanween/ban_tanween.mp3"
            },
            {
                arabic: "بٍ",
                transliteration: "bin",
                pronunciation: "bin",
                explanation: "Baa with Tanween Kasr (ٍ). Makes 'bin' sound.",
                hint: "Double kasra = 'in' sound",
                audio: "audio/tanween/bin_tanween.mp3"
            },
            {
                arabic: "بٌ",
                transliteration: "bun",
                pronunciation: "bun",
                explanation: "Baa with Tanween Damm (ٌ). Makes 'bun' sound.",
                hint: "Double damma = 'un' sound",
                audio: "audio/tanween/bun_tanween.mp3"
            },
            {
                arabic: "فً",
                transliteration: "fan",
                pronunciation: "fan",
                explanation: "Faa with Tanween Fath. Makes 'fan' sound.",
                hint: "F + double fatha",
                audio: "audio/tanween/fan_tanween.mp3"
            },
            {
                arabic: "فٍ",
                transliteration: "fin",
                pronunciation: "fin",
                explanation: "Faa with Tanween Kasr. Makes 'fin' sound.",
                hint: "F + double kasra",
                audio: "audio/tanween/fin_tanween.mp3"
            },
            {
                arabic: "فٌ",
                transliteration: "fun",
                pronunciation: "fun",
                explanation: "Faa with Tanween Damm. Makes 'fun' sound.",
                hint: "F + double damma",
                audio: "audio/tanween/fun_tanween.mp3"
            },
            {
                arabic: "مً",
                transliteration: "man",
                pronunciation: "man",
                explanation: "Meem with Tanween Fath. Makes 'man' sound.",
                hint: "M + double fatha",
                audio: "audio/tanween/man_tanween.mp3"
            },
            {
                arabic: "مٍ",
                transliteration: "min",
                pronunciation: "min",
                explanation: "Meem with Tanween Kasr. Makes 'min' sound.",
                hint: "M + double kasra",
                audio: "audio/tanween/min_tanween.mp3"
            },
            {
                arabic: "مٌ",
                transliteration: "mun",
                pronunciation: "mun",
                explanation: "Meem with Tanween Damm. Makes 'mun' sound.",
                hint: "M + double damma",
                audio: "audio/tanween/mun_tanween.mp3"
            }
        ]
    },
    7: {
        title: "Lesson 7: Advanced Rules (القواعد المتقدمة)",
        description: "Learn advanced reading rules and special combinations",
        cards: [
            {
                arabic: "بِسْمِ اللّٰه",
                transliteration: "bismillah",
                pronunciation: "bismillah",
                explanation: "Bismillah - 'In the name of Allah'. Common Islamic phrase.",
                hint: "In the name of Allah",
                audio: "audio/advanced/bismillah.mp3"
            },
            {
                arabic: "كَلِمَة",
                transliteration: "kalima",
                pronunciation: "kalima",
                explanation: "Kalima means 'word'. Practice reading longer words.",
                hint: "Word - longer word",
                audio: "audio/advanced/word1.mp3"
            },
            {
                arabic: "مَدْرَسَة",
                transliteration: "madrasa",
                pronunciation: "madrasa",
                explanation: "Madrasa means 'school'. Practice reading longer words.",
                hint: "School - longer word",
                audio: "audio/advanced/madrasa.mp3"
            },
            {
                arabic: "كِتَاب",
                transliteration: "kitaab",
                pronunciation: "kitaab",
                explanation: "Kitaab means 'book'. Contains long vowel 'aa'.",
                hint: "Book - with long vowel",
                audio: "audio/advanced/kitaab.mp3"
            },
            {
                arabic: "مُعَلِّم",
                transliteration: "mu'allim",
                pronunciation: "mu'allim",
                explanation: "Mu'allim means 'teacher'. Contains shaddah on Laam.",
                hint: "Teacher - with shaddah",
                audio: "audio/advanced/muallim.mp3"
            },
            {
                arabic: "طَالِب",
                transliteration: "taalib",
                pronunciation: "taalib",
                explanation: "Taalib means 'student'. Practice emphatic letters.",
                hint: "Student - emphatic Taa",
                audio: "audio/advanced/taalib.mp3"
            }
        ]
    }
};
