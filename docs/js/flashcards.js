// Norani Qaida Flashcards Data
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
                hint: "Has three dots above"
            },
            {
                arabic: "ج",
                transliteration: "Jeem",
                pronunciation: "j",
                explanation: "Fifth letter. Makes a 'j' sound like in 'jump'.",
                hint: "Has one dot below"
            },
            {
                arabic: "ح",
                transliteration: "Haa",
                pronunciation: "h",
                explanation: "Sixth letter. Makes a breathy 'h' sound from the throat.",
                hint: "No dots, curved shape"
            },
            {
                arabic: "خ",
                transliteration: "Khaa",
                pronunciation: "kh",
                explanation: "Seventh letter. Makes a 'kh' sound like clearing throat.",
                hint: "Has one dot above"
            },
            {
                arabic: "د",
                transliteration: "Daal",
                pronunciation: "d",
                explanation: "Eighth letter. Makes a 'd' sound like in 'door'.",
                hint: "No dots, curved at top"
            },
            {
                arabic: "ذ",
                transliteration: "Dhaal",
                pronunciation: "dh",
                explanation: "Ninth letter. Makes a 'th' sound like in 'this'.",
                hint: "Has one dot above"
            },
            {
                arabic: "ر",
                transliteration: "Raa",
                pronunciation: "r",
                explanation: "Tenth letter. Makes a rolled 'r' sound.",
                hint: "No dots, curved hook"
            },
            {
                arabic: "ز",
                transliteration: "Zaay",
                pronunciation: "z",
                explanation: "Eleventh letter. Makes a 'z' sound like in 'zoo'.",
                hint: "Has one dot above"
            },
            {
                arabic: "س",
                transliteration: "Seen",
                pronunciation: "s",
                explanation: "Twelfth letter. Makes an 's' sound like in 'sun'.",
                hint: "Has three teeth, no dots"
            },
            {
                arabic: "ش",
                transliteration: "Sheen",
                pronunciation: "sh",
                explanation: "Thirteenth letter. Makes a 'sh' sound like in 'ship'.",
                hint: "Has three teeth and three dots above"
            },
            {
                arabic: "ص",
                transliteration: "Saad",
                pronunciation: "s",
                explanation: "Fourteenth letter. Makes an emphatic 's' sound.",
                hint: "Curved with no dots"
            },
            {
                arabic: "ض",
                transliteration: "Daad",
                pronunciation: "d",
                explanation: "Fifteenth letter. Makes an emphatic 'd' sound.",
                hint: "Has one dot above"
            },
            {
                arabic: "ط",
                transliteration: "Taa",
                pronunciation: "t",
                explanation: "Sixteenth letter. Makes an emphatic 't' sound.",
                hint: "Curved with no dots"
            },
            {
                arabic: "ظ",
                transliteration: "Dhaa",
                pronunciation: "dh",
                explanation: "Seventeenth letter. Makes an emphatic 'th' sound.",
                hint: "Has one dot above"
            },
            {
                arabic: "ع",
                transliteration: "Ayn",
                pronunciation: "'a",
                explanation: "Eighteenth letter. Makes a deep throat sound.",
                hint: "Curved opening, no dots"
            },
            {
                arabic: "غ",
                transliteration: "Ghayn",
                pronunciation: "gh",
                explanation: "Nineteenth letter. Makes a gargling 'gh' sound.",
                hint: "Has one dot above"
            },
            {
                arabic: "ف",
                transliteration: "Faa",
                pronunciation: "f",
                explanation: "Twentieth letter. Makes an 'f' sound like in 'fish'.",
                hint: "Has one dot above"
            },
            {
                arabic: "ق",
                transliteration: "Qaaf",
                pronunciation: "q",
                explanation: "Twenty-first letter. Makes a deep 'q' sound from throat.",
                hint: "Has two dots above"
            },
            {
                arabic: "ك",
                transliteration: "Kaaf",
                pronunciation: "k",
                explanation: "Twenty-second letter. Makes a 'k' sound like in 'key'.",
                hint: "No dots, has a small tooth"
            },
            {
                arabic: "ل",
                transliteration: "Laam",
                pronunciation: "l",
                explanation: "Twenty-third letter. Makes an 'l' sound like in 'love'.",
                hint: "No dots, tall and curved"
            },
            {
                arabic: "م",
                transliteration: "Meem",
                pronunciation: "m",
                explanation: "Twenty-fourth letter. Makes an 'm' sound like in 'moon'.",
                hint: "No dots, circular shape"
            },
            {
                arabic: "ن",
                transliteration: "Noon",
                pronunciation: "n",
                explanation: "Twenty-fifth letter. Makes an 'n' sound like in 'name'.",
                hint: "Has one dot above"
            },
            {
                arabic: "ه",
                transliteration: "Haa",
                pronunciation: "h",
                explanation: "Twenty-sixth letter. Makes a soft 'h' sound.",
                hint: "No dots, oval shape"
            },
            {
                arabic: "و",
                transliteration: "Waaw",
                pronunciation: "w/oo",
                explanation: "Twenty-seventh letter. Makes 'w' or long 'oo' sound.",
                hint: "No dots, curved like a hook"
            },
            {
                arabic: "ي",
                transliteration: "Yaa",
                pronunciation: "y/ee",
                explanation: "Twenty-eighth letter. Makes 'y' or long 'ee' sound.",
                hint: "Has two dots below"
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
                hint: "Two letters joined"
            },
            {
                arabic: "تا",
                transliteration: "taa",
                pronunciation: "taa",
                explanation: "Taa + Alif. The letter ت connected to ا.",
                hint: "Two dots above + alif"
            },
            {
                arabic: "ثا",
                transliteration: "thaa",
                pronunciation: "thaa",
                explanation: "Thaa + Alif. The letter ث connected to ا.",
                hint: "Three dots above + alif"
            },
            {
                arabic: "جا",
                transliteration: "jaa",
                pronunciation: "jaa",
                explanation: "Jeem + Alif. The letter ج connected to ا.",
                hint: "Curved letter + alif"
            },
            {
                arabic: "حا",
                transliteration: "haa",
                pronunciation: "haa",
                explanation: "Haa + Alif. The letter ح connected to ا.",
                hint: "No dots + alif"
            },
            {
                arabic: "خا",
                transliteration: "khaa",
                pronunciation: "khaa",
                explanation: "Khaa + Alif. The letter خ connected to ا.",
                hint: "One dot above + alif"
            },
            {
                arabic: "سا",
                transliteration: "saa",
                pronunciation: "saa",
                explanation: "Seen + Alif. The letter س connected to ا.",
                hint: "Three teeth + alif"
            },
            {
                arabic: "شا",
                transliteration: "shaa",
                pronunciation: "shaa",
                explanation: "Sheen + Alif. The letter ش connected to ا.",
                hint: "Three teeth + three dots + alif"
            },
            {
                arabic: "صا",
                transliteration: "saa",
                pronunciation: "saa",
                explanation: "Saad + Alif. The letter ص connected to ا.",
                hint: "Emphatic s + alif"
            },
            {
                arabic: "ضا",
                transliteration: "daa",
                pronunciation: "daa",
                explanation: "Daad + Alif. The letter ض connected to ا.",
                hint: "Emphatic d + alif"
            },
            {
                arabic: "طا",
                transliteration: "taa",
                pronunciation: "taa",
                explanation: "Taa + Alif. The letter ط connected to ا.",
                hint: "Emphatic t + alif"
            },
            {
                arabic: "ظا",
                transliteration: "dhaa",
                pronunciation: "dhaa",
                explanation: "Dhaa + Alif. The letter ظ connected to ا.",
                hint: "Emphatic dh + alif"
            },
            {
                arabic: "عا",
                transliteration: "'aa",
                pronunciation: "'aa",
                explanation: "Ayn + Alif. The letter ع connected to ا.",
                hint: "Deep throat sound + alif"
            },
            {
                arabic: "غا",
                transliteration: "ghaa",
                pronunciation: "ghaa",
                explanation: "Ghayn + Alif. The letter غ connected to ا.",
                hint: "Gargling sound + alif"
            },
            {
                arabic: "فا",
                transliteration: "faa",
                pronunciation: "faa",
                explanation: "Faa + Alif. The letter ف connected to ا.",
                hint: "F sound + alif"
            },
            {
                arabic: "قا",
                transliteration: "qaa",
                pronunciation: "qaa",
                explanation: "Qaaf + Alif. The letter ق connected to ا.",
                hint: "Deep q + alif"
            },
            {
                arabic: "كا",
                transliteration: "kaa",
                pronunciation: "kaa",
                explanation: "Kaaf + Alif. The letter ك connected to ا.",
                hint: "K sound + alif"
            },
            {
                arabic: "لا",
                transliteration: "laa",
                pronunciation: "laa",
                explanation: "Laam + Alif. Special combination لا.",
                hint: "Special joined form"
            },
            {
                arabic: "ما",
                transliteration: "maa",
                pronunciation: "maa",
                explanation: "Meem + Alif. The letter م connected to ا.",
                hint: "M sound + alif"
            },
            {
                arabic: "نا",
                transliteration: "naa",
                pronunciation: "naa",
                explanation: "Noon + Alif. The letter ن connected to ا.",
                hint: "N sound + alif"
            },
            {
                arabic: "ها",
                transliteration: "haa",
                pronunciation: "haa",
                explanation: "Haa + Alif. The letter ه connected to ا.",
                hint: "Soft h + alif"
            },
            {
                arabic: "يا",
                transliteration: "yaa",
                pronunciation: "yaa",
                explanation: "Yaa + Alif. The letter ي connected to ا.",
                hint: "Y sound + alif"
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
                hint: "Small line above = 'a' sound"
            },
            {
                arabic: "بِ",
                transliteration: "bi",
                pronunciation: "bi",
                explanation: "Baa with Kasra (ِ). Makes 'bi' sound like in 'bit'.",
                hint: "Small line below = 'i' sound"
            },
            {
                arabic: "بُ",
                transliteration: "bu",
                pronunciation: "bu",
                explanation: "Baa with Damma (ُ). Makes 'bu' sound like in 'book'.",
                hint: "Small curl above = 'u' sound"
            },
            {
                arabic: "تَ",
                transliteration: "ta",
                pronunciation: "ta",
                explanation: "Taa with Fatha. Makes 'ta' sound.",
                hint: "Two dots + fatha"
            },
            {
                arabic: "تِ",
                transliteration: "ti",
                pronunciation: "ti",
                explanation: "Taa with Kasra. Makes 'ti' sound.",
                hint: "Two dots + kasra"
            },
            {
                arabic: "تُ",
                transliteration: "tu",
                pronunciation: "tu",
                explanation: "Taa with Damma. Makes 'tu' sound.",
                hint: "Two dots + damma"
            },
            {
                arabic: "ثَ",
                transliteration: "tha",
                pronunciation: "tha",
                explanation: "Thaa with Fatha. Makes 'tha' sound.",
                hint: "Three dots + fatha"
            },
            {
                arabic: "ثِ",
                transliteration: "thi",
                pronunciation: "thi",
                explanation: "Thaa with Kasra. Makes 'thi' sound.",
                hint: "Three dots + kasra"
            },
            {
                arabic: "ثُ",
                transliteration: "thu",
                pronunciation: "thu",
                explanation: "Thaa with Damma. Makes 'thu' sound.",
                hint: "Three dots + damma"
            },
            {
                arabic: "جَ",
                transliteration: "ja",
                pronunciation: "ja",
                explanation: "Jeem with Fatha. Makes 'ja' sound.",
                hint: "Curved letter + fatha"
            },
            {
                arabic: "جِ",
                transliteration: "ji",
                pronunciation: "ji",
                explanation: "Jeem with Kasra. Makes 'ji' sound.",
                hint: "Curved letter + kasra"
            },
            {
                arabic: "جُ",
                transliteration: "ju",
                pronunciation: "ju",
                explanation: "Jeem with Damma. Makes 'ju' sound.",
                hint: "Curved letter + damma"
            },
            {
                arabic: "حَ",
                transliteration: "ha",
                pronunciation: "ha",
                explanation: "Haa with Fatha. Makes 'ha' sound.",
                hint: "No dots + fatha"
            },
            {
                arabic: "حِ",
                transliteration: "hi",
                pronunciation: "hi",
                explanation: "Haa with Kasra. Makes 'hi' sound.",
                hint: "No dots + kasra"
            },
            {
                arabic: "حُ",
                transliteration: "hu",
                pronunciation: "hu",
                explanation: "Haa with Damma. Makes 'hu' sound.",
                hint: "No dots + damma"
            },
            {
                arabic: "خَ",
                transliteration: "kha",
                pronunciation: "kha",
                explanation: "Khaa with Fatha. Makes 'kha' sound.",
                hint: "One dot + fatha"
            },
            {
                arabic: "خِ",
                transliteration: "khi",
                pronunciation: "khi",
                explanation: "Khaa with Kasra. Makes 'khi' sound.",
                hint: "One dot + kasra"
            },
            {
                arabic: "خُ",
                transliteration: "khu",
                pronunciation: "khu",
                explanation: "Khaa with Damma. Makes 'khu' sound.",
                hint: "One dot + damma"
            },
            {
                arabic: "سَ",
                transliteration: "sa",
                pronunciation: "sa",
                explanation: "Seen with Fatha. Makes 'sa' sound.",
                hint: "Three teeth + fatha"
            },
            {
                arabic: "سِ",
                transliteration: "si",
                pronunciation: "si",
                explanation: "Seen with Kasra. Makes 'si' sound.",
                hint: "Three teeth + kasra"
            },
            {
                arabic: "سُ",
                transliteration: "su",
                pronunciation: "su",
                explanation: "Seen with Damma. Makes 'su' sound.",
                hint: "Three teeth + damma"
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
                hint: "Long 'aa' sound"
            },
            {
                arabic: "بو",
                transliteration: "boo",
                pronunciation: "boo",
                explanation: "Baa + Waaw makes long 'oo' sound. Hold for 2 counts.",
                hint: "Long 'oo' sound"
            },
            {
                arabic: "بي",
                transliteration: "bee",
                pronunciation: "bee",
                explanation: "Baa + Yaa makes long 'ee' sound. Hold for 2 counts.",
                hint: "Long 'ee' sound"
            },
            {
                arabic: "تا",
                transliteration: "taa",
                pronunciation: "taa",
                explanation: "Taa + Alif makes long 'aa' sound.",
                hint: "Two dots + long aa"
            },
            {
                arabic: "تو",
                transliteration: "too",
                pronunciation: "too",
                explanation: "Taa + Waaw makes long 'oo' sound.",
                hint: "Two dots + long oo"
            },
            {
                arabic: "تي",
                transliteration: "tee",
                pronunciation: "tee",
                explanation: "Taa + Yaa makes long 'ee' sound.",
                hint: "Two dots + long ee"
            },
            {
                arabic: "ثا",
                transliteration: "thaa",
                pronunciation: "thaa",
                explanation: "Thaa + Alif makes long 'aa' sound.",
                hint: "Three dots + long aa"
            },
            {
                arabic: "ثو",
                transliteration: "thoo",
                pronunciation: "thoo",
                explanation: "Thaa + Waaw makes long 'oo' sound.",
                hint: "Three dots + long oo"
            },
            {
                arabic: "ثي",
                transliteration: "thee",
                pronunciation: "thee",
                explanation: "Thaa + Yaa makes long 'ee' sound.",
                hint: "Three dots + long ee"
            },
            {
                arabic: "جا",
                transliteration: "jaa",
                pronunciation: "jaa",
                explanation: "Jeem + Alif makes long 'aa' sound.",
                hint: "Curved + long aa"
            },
            {
                arabic: "جو",
                transliteration: "joo",
                pronunciation: "joo",
                explanation: "Jeem + Waaw makes long 'oo' sound.",
                hint: "Curved + long oo"
            },
            {
                arabic: "جي",
                transliteration: "jee",
                pronunciation: "jee",
                explanation: "Jeem + Yaa makes long 'ee' sound.",
                hint: "Curved + long ee"
            },
            {
                arabic: "حا",
                transliteration: "haa",
                pronunciation: "haa",
                explanation: "Haa + Alif makes long 'aa' sound.",
                hint: "No dots + long aa"
            },
            {
                arabic: "حو",
                transliteration: "hoo",
                pronunciation: "hoo",
                explanation: "Haa + Waaw makes long 'oo' sound.",
                hint: "No dots + long oo"
            },
            {
                arabic: "حي",
                transliteration: "hee",
                pronunciation: "hee",
                explanation: "Haa + Yaa makes long 'ee' sound.",
                hint: "No dots + long ee"
            },
            {
                arabic: "خا",
                transliteration: "khaa",
                pronunciation: "khaa",
                explanation: "Khaa + Alif makes long 'aa' sound.",
                hint: "One dot + long aa"
            },
            {
                arabic: "خو",
                transliteration: "khoo",
                pronunciation: "khoo",
                explanation: "Khaa + Waaw makes long 'oo' sound.",
                hint: "One dot + long oo"
            },
            {
                arabic: "خي",
                transliteration: "khee",
                pronunciation: "khee",
                explanation: "Khaa + Yaa makes long 'ee' sound.",
                hint: "One dot + long ee"
            },
            {
                arabic: "سا",
                transliteration: "saa",
                pronunciation: "saa",
                explanation: "Seen + Alif makes long 'aa' sound.",
                hint: "Three teeth + long aa"
            },
            {
                arabic: "سو",
                transliteration: "soo",
                pronunciation: "soo",
                explanation: "Seen + Waaw makes long 'oo' sound.",
                hint: "Three teeth + long oo"
            },
            {
                arabic: "سي",
                transliteration: "see",
                pronunciation: "see",
                explanation: "Seen + Yaa makes long 'ee' sound.",
                hint: "Three teeth + long ee"
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
                hint: "Small circle = no vowel"
            },
            {
                arabic: "تْ",
                transliteration: "t",
                pronunciation: "t",
                explanation: "Taa with Sukun. No vowel sound, just 't'.",
                hint: "Two dots + sukun"
            },
            {
                arabic: "ثْ",
                transliteration: "th",
                pronunciation: "th",
                explanation: "Thaa with Sukun. No vowel sound, just 'th'.",
                hint: "Three dots + sukun"
            },
            {
                arabic: "جْ",
                transliteration: "j",
                pronunciation: "j",
                explanation: "Jeem with Sukun. No vowel sound, just 'j'.",
                hint: "Curved + sukun"
            },
            {
                arabic: "بَّ",
                transliteration: "bba",
                pronunciation: "bba",
                explanation: "Baa with Shaddah and Fatha (َّ). Double 'b' with 'a' sound.",
                hint: "W-shape = double letter"
            },
            {
                arabic: "تَّ",
                transliteration: "tta",
                pronunciation: "tta",
                explanation: "Taa with Shaddah and Fatha. Double 't' with 'a' sound.",
                hint: "Two dots + shaddah + fatha"
            },
            {
                arabic: "ثَّ",
                transliteration: "ththa",
                pronunciation: "ththa",
                explanation: "Thaa with Shaddah and Fatha. Double 'th' with 'a' sound.",
                hint: "Three dots + shaddah + fatha"
            },
            {
                arabic: "جَّ",
                transliteration: "jja",
                pronunciation: "jja",
                explanation: "Jeem with Shaddah and Fatha. Double 'j' with 'a' sound.",
                hint: "Curved + shaddah + fatha"
            },
            {
                arabic: "بِّ",
                transliteration: "bbi",
                pronunciation: "bbi",
                explanation: "Baa with Shaddah and Kasra (ِّ). Double 'b' with 'i' sound.",
                hint: "Shaddah + kasra"
            },
            {
                arabic: "تِّ",
                transliteration: "tti",
                pronunciation: "tti",
                explanation: "Taa with Shaddah and Kasra. Double 't' with 'i' sound.",
                hint: "Two dots + shaddah + kasra"
            },
            {
                arabic: "ثِّ",
                transliteration: "tthi",
                pronunciation: "tthi",
                explanation: "Thaa with Shaddah and Kasra. Double 'th' with 'i' sound.",
                hint: "Three dots + shaddah + kasra"
            },
            {
                arabic: "جِّ",
                transliteration: "jji",
                pronunciation: "jji",
                explanation: "Jeem with Shaddah and Kasra. Double 'j' with 'i' sound.",
                hint: "Curved + shaddah + kasra"
            },
            {
                arabic: "بُّ",
                transliteration: "bbu",
                pronunciation: "bbu",
                explanation: "Baa with Shaddah and Damma (ُّ). Double 'b' with 'u' sound.",
                hint: "Shaddah + damma"
            },
            {
                arabic: "تُّ",
                transliteration: "ttu",
                pronunciation: "ttu",
                explanation: "Taa with Shaddah and Damma. Double 't' with 'u' sound.",
                hint: "Two dots + shaddah + damma"
            },
            {
                arabic: "ثُّ",
                transliteration: "tthu",
                pronunciation: "tthu",
                explanation: "Thaa with Shaddah and Damma. Double 'th' with 'u' sound.",
                hint: "Three dots + shaddah + damma"
            },
            {
                arabic: "جُّ",
                transliteration: "jju",
                pronunciation: "jju",
                explanation: "Jeem with Shaddah and Damma. Double 'j' with 'u' sound.",
                hint: "Curved + shaddah + damma"
            },
            {
                arabic: "سْ",
                transliteration: "s",
                pronunciation: "s",
                explanation: "Seen with Sukun. No vowel sound, just 's'.",
                hint: "Three teeth + sukun"
            },
            {
                arabic: "شْ",
                transliteration: "sh",
                pronunciation: "sh",
                explanation: "Sheen with Sukun. No vowel sound, just 'sh'.",
                hint: "Three teeth + three dots + sukun"
            },
            {
                arabic: "سَّ",
                transliteration: "ssa",
                pronunciation: "ssa",
                explanation: "Seen with Shaddah and Fatha. Double 's' with 'a' sound.",
                hint: "Three teeth + shaddah + fatha"
            },
            {
                arabic: "شَّ",
                transliteration: "shsha",
                pronunciation: "shsha",
                explanation: "Sheen with Shaddah and Fatha. Double 'sh' with 'a' sound.",
                hint: "Three teeth + three dots + shaddah + fatha"
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
                hint: "Double fatha = 'an' sound"
            },
            {
                arabic: "بٍ",
                transliteration: "bin",
                pronunciation: "bin",
                explanation: "Baa with Tanween Kasr (ٍ). Makes 'bin' sound.",
                hint: "Double kasra = 'in' sound"
            },
            {
                arabic: "بٌ",
                transliteration: "bun",
                pronunciation: "bun",
                explanation: "Baa with Tanween Damm (ٌ). Makes 'bun' sound.",
                hint: "Double damma = 'un' sound"
            },
            {
                arabic: "تً",
                transliteration: "tan",
                pronunciation: "tan",
                explanation: "Taa with Tanween Fath. Makes 'tan' sound.",
                hint: "Two dots + double fatha"
            },
            {
                arabic: "تٍ",
                transliteration: "tin",
                pronunciation: "tin",
                explanation: "Taa with Tanween Kasr. Makes 'tin' sound.",
                hint: "Two dots + double kasra"
            },
            {
                arabic: "تٌ",
                transliteration: "tun",
                pronunciation: "tun",
                explanation: "Taa with Tanween Damm. Makes 'tun' sound.",
                hint: "Two dots + double damma"
            },
            {
                arabic: "ثً",
                transliteration: "than",
                pronunciation: "than",
                explanation: "Thaa with Tanween Fath. Makes 'than' sound.",
                hint: "Three dots + double fatha"
            },
            {
                arabic: "ثٍ",
                transliteration: "thin",
                pronunciation: "thin",
                explanation: "Thaa with Tanween Kasr. Makes 'thin' sound.",
                hint: "Three dots + double kasra"
            },
            {
                arabic: "ثٌ",
                transliteration: "thun",
                pronunciation: "thun",
                explanation: "Thaa with Tanween Damm. Makes 'thun' sound.",
                hint: "Three dots + double damma"
            },
            {
                arabic: "جً",
                transliteration: "jan",
                pronunciation: "jan",
                explanation: "Jeem with Tanween Fath. Makes 'jan' sound.",
                hint: "Curved + double fatha"
            },
            {
                arabic: "جٍ",
                transliteration: "jin",
                pronunciation: "jin",
                explanation: "Jeem with Tanween Kasr. Makes 'jin' sound.",
                hint: "Curved + double kasra"
            },
            {
                arabic: "جٌ",
                transliteration: "jun",
                pronunciation: "jun",
                explanation: "Jeem with Tanween Damm. Makes 'jun' sound.",
                hint: "Curved + double damma"
            },
            {
                arabic: "حً",
                transliteration: "han",
                pronunciation: "han",
                explanation: "Haa with Tanween Fath. Makes 'han' sound.",
                hint: "No dots + double fatha"
            },
            {
                arabic: "حٍ",
                transliteration: "hin",
                pronunciation: "hin",
                explanation: "Haa with Tanween Kasr. Makes 'hin' sound.",
                hint: "No dots + double kasra"
            },
            {
                arabic: "حٌ",
                transliteration: "hun",
                pronunciation: "hun",
                explanation: "Haa with Tanween Damm. Makes 'hun' sound.",
                hint: "No dots + double damma"
            }
        ]
    },
    7: {
        title: "Lesson 7: Advanced Rules (القواعد المتقدمة)",
        description: "Learn advanced reading rules and special combinations",
        cards: [
            {
                arabic: "الْ",
                transliteration: "al",
                pronunciation: "al",
                explanation: "The definite article 'Al' (الْ). Used before nouns.",
                hint: "Alif + Laam with sukun"
            },
            {
                arabic: "الْبَيْت",
                transliteration: "al-bayt",
                pronunciation: "al-bayt",
                explanation: "Al-Bayt means 'the house'. Example of definite article usage.",
                hint: "The + house"
            },
            {
                arabic: "الشَّمْس",
                transliteration: "ash-shams",
                pronunciation: "ash-shams",
                explanation: "Ash-Shams means 'the sun'. Laam assimilates with Sheen.",
                hint: "Sun letter assimilation"
            },
            {
                arabic: "الْقَمَر",
                transliteration: "al-qamar",
                pronunciation: "al-qamar",
                explanation: "Al-Qamar means 'the moon'. Laam is pronounced with moon letters.",
                hint: "Moon letter - Laam pronounced"
            },
            {
                arabic: "مَدْرَسَة",
                transliteration: "madrasa",
                pronunciation: "madrasa",
                explanation: "Madrasa means 'school'. Practice reading longer words.",
                hint: "School - longer word"
            },
            {
                arabic: "كِتَاب",
                transliteration: "kitaab",
                pronunciation: "kitaab",
                explanation: "Kitaab means 'book'. Contains long vowel 'aa'.",
                hint: "Book - with long vowel"
            },
            {
                arabic: "مُعَلِّم",
                transliteration: "mu'allim",
                pronunciation: "mu'allim",
                explanation: "Mu'allim means 'teacher'. Contains shaddah on Laam.",
                hint: "Teacher - with shaddah"
            },
            {
                arabic: "طَالِب",
                transliteration: "taalib",
                pronunciation: "taalib",
                explanation: "Taalib means 'student'. Practice emphatic letters.",
                hint: "Student - emphatic Taa"
            },
            {
                arabic: "بِسْمِ اللّٰه",
                transliteration: "bismillah",
                pronunciation: "bismillah",
                explanation: "Bismillah - 'In the name of Allah'. Common Islamic phrase.",
                hint: "In the name of Allah"
            },
            {
                arabic: "الْحَمْدُ لِلّٰه",
                transliteration: "alhamdulillah",
                pronunciation: "alhamdulillah",
                explanation: "Alhamdulillah - 'Praise be to Allah'. Common phrase of gratitude.",
                hint: "Praise be to Allah"
            },
            {
                arabic: "السَّلَامُ عَلَيْكُم",
                transliteration: "as-salaamu alaykum",
                pronunciation: "as-salaamu alaykum",
                explanation: "As-Salaamu Alaykum - 'Peace be upon you'. Islamic greeting.",
                hint: "Peace be upon you"
            },
            {
                arabic: "وَعَلَيْكُمُ السَّلَام",
                transliteration: "wa alaykumus-salaam",
                pronunciation: "wa alaykumus-salaam",
                explanation: "Wa Alaykumus-Salaam - Response to Islamic greeting.",
                hint: "And upon you peace"
            }
        ]
    }
};
