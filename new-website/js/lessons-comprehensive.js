// Comprehensive Norani Lessons Data Structure - Using 800+ Audio Files
const lessons = [
    {
        id: 1,
        title: "الدرس الأول: الحروف العربية الأساسية",
        description: "تعلم الحروف العربية الأساسية",
        type: "letters",
        content: {
            letters: [
                { arabic: "ا", name: "ألف", audio: "l1alf.mp3" },
                { arabic: "ب", name: "باء", audio: "l1baa.mp3" },
                { arabic: "ت", name: "تاء", audio: "l1taa.mp3" },
                { arabic: "ث", name: "ثاء", audio: "l1sthaa.mp3" },
                { arabic: "ج", name: "جيم", audio: "l1geem.mp3" },
                { arabic: "ح", name: "حاء", audio: "l1haa.mp3" },
                { arabic: "خ", name: "خاء", audio: "l1kaaf.mp3" },
                { arabic: "د", name: "دال", audio: "l1daal.mp3" }
            ]
        },
        mainAudio: "lesson1.mp3"
    },
    {
        id: 2,
        title: "الدرس الثاني: المزيد من الحروف",
        description: "استكمال تعلم الحروف العربية",
        type: "letters",
        content: {
            letters: [
                { arabic: "ذ", name: "ذال", audio: "l1zaal.mp3" },
                { arabic: "ر", name: "راء", audio: "l1raa.mp3" },
                { arabic: "ز", name: "زاي", audio: "l1zaa.mp3" },
                { arabic: "س", name: "سين", audio: "l1seen.mp3" },
                { arabic: "ش", name: "شين", audio: "l1sheen.mp3" },
                { arabic: "ص", name: "صاد", audio: "l1saad.mp3" },
                { arabic: "ض", name: "ضاد", audio: "l1daad.mp3" },
                { arabic: "ط", name: "طاء", audio: "l1ttaa.mp3" }
            ]
        },
        mainAudio: "p2_title.mp3"
    },
    {
        id: 3,
        title: "الدرس الثالث: إكمال الحروف",
        description: "الحروف المتبقية من الأبجدية العربية",
        type: "letters",
        content: {
            letters: [
                { arabic: "ظ", name: "ظاء", audio: "l1zzaa.mp3" },
                { arabic: "ع", name: "عين", audio: "l13aeen.mp3" },
                { arabic: "غ", name: "غين", audio: "l1ghaeen.mp3" },
                { arabic: "ف", name: "فاء", audio: "l1faa.mp3" },
                { arabic: "ق", name: "قاف", audio: "l1qaaf.mp3" },
                { arabic: "ك", name: "كاف", audio: "l1kaaf.mp3" },
                { arabic: "ل", name: "لام", audio: "l1laam.mp3" },
                { arabic: "م", name: "ميم", audio: "l1meem.mp3" }
            ]
        },
        mainAudio: "p3_title.mp3"
    },
    {
        id: 4,
        title: "الدرس الرابع: الحروف الأخيرة",
        description: "إنهاء تعلم جميع الحروف العربية",
        type: "letters",
        content: {
            letters: [
                { arabic: "ن", name: "نون", audio: "l1noon.mp3" },
                { arabic: "ه", name: "هاء", audio: "l15aa.mp3" },
                { arabic: "و", name: "واو", audio: "l1waw.mp3" },
                { arabic: "ي", name: "ياء", audio: "l1yaa.mp3" },
                { arabic: "ء", name: "همزة", audio: "l1hamza.mp3" },
                { arabic: "خ", name: "خاء", audio: "l17aa.mp3" },
                { arabic: "ي", name: "ياء مدية", audio: "l1yaa2.mp3" }
            ]
        },
        mainAudio: "p4_title.mp3"
    },
    {
        id: 5,
        title: "الدرس الخامس: الحركات الأساسية",
        description: "تعلم الفتحة والضمة والكسرة",
        type: "harakat",
        content: {
            letters: [
                { arabic: "بَ", name: "با بالفتحة", audio: "p10_bae.mp3" },
                { arabic: "بُ", name: "با بالضمة", audio: "p10_bao.mp3" },
                { arabic: "تَ", name: "تا بالفتحة", audio: "p10_tae.mp3" },
                { arabic: "تُ", name: "تا بالضمة", audio: "p10_tao.mp3" },
                { arabic: "جَ", name: "جيم بالفتحة", audio: "p10_gae.mp3" },
                { arabic: "جُ", name: "جيم بالضمة", audio: "p10_gao.mp3" },
                { arabic: "دَ", name: "دال بالفتحة", audio: "p10_dae.mp3" },
                { arabic: "دُ", name: "دال بالضمة", audio: "p10_dao.mp3" }
            ]
        },
        mainAudio: "p5_title.mp3"
    },
    {
        id: 6,
        title: "الدرس السادس: المزيد من الحركات",
        description: "تطبيق الحركات على حروف مختلفة",
        type: "harakat",
        content: {
            letters: [
                { arabic: "رَ", name: "راء بالفتحة", audio: "p10_rae.mp3" },
                { arabic: "رُ", name: "راء بالضمة", audio: "p10_rao.mp3" },
                { arabic: "سَ", name: "سين بالفتحة", audio: "p10_sae.mp3" },
                { arabic: "سُ", name: "سين بالضمة", audio: "p10_sao.mp3" },
                { arabic: "شَ", name: "شين بالفتحة", audio: "p10_shae.mp3" },
                { arabic: "شُ", name: "شين بالضمة", audio: "p10_shao.mp3" },
                { arabic: "صَ", name: "صاد بالفتحة", audio: "p10_ssae.mp3" },
                { arabic: "صُ", name: "صاد بالضمة", audio: "p10_ssao.mp3" }
            ]
        },
        mainAudio: "p6_title.mp3"
    },
    {
        id: 7,
        title: "الدرس السابع: حركات متقدمة",
        description: "حركات على حروف أخرى",
        type: "harakat",
        content: {
            letters: [
                { arabic: "ضَ", name: "ضاد بالفتحة", audio: "p10_ddae.mp3" },
                { arabic: "ضُ", name: "ضاد بالضمة", audio: "p10_ddao.mp3" },
                { arabic: "فَ", name: "فاء بالفتحة", audio: "p10_fae.mp3" },
                { arabic: "فُ", name: "فاء بالضمة", audio: "p10_fao.mp3" },
                { arabic: "قَ", name: "قاف بالفتحة", audio: "p10_qae.mp3" },
                { arabic: "قُ", name: "قاف بالضمة", audio: "p10_qao.mp3" },
                { arabic: "كَ", name: "كاف بالفتحة", audio: "p10_kae.mp3" },
                { arabic: "كُ", name: "كاف بالضمة", audio: "p10_kao.mp3" }
            ]
        },
        mainAudio: "p7_title.mp3"
    },
    {
        id: 8,
        title: "الدرس الثامن: إكمال الحركات",
        description: "إكمال تعلم الحركات",
        type: "harakat",
        content: {
            letters: [
                { arabic: "لَ", name: "لام بالفتحة", audio: "p10_lae.mp3" },
                { arabic: "لُ", name: "لام بالضمة", audio: "p10_lao.mp3" },
                { arabic: "مَ", name: "ميم بالفتحة", audio: "p10_ma.mp3" },
                { arabic: "مُ", name: "ميم بالضمة", audio: "p10_mao.mp3" },
                { arabic: "نَ", name: "نون بالفتحة", audio: "p10_nae.mp3" },
                { arabic: "نُ", name: "نون بالضمة", audio: "p10_nao.mp3" },
                { arabic: "وَ", name: "واو بالفتحة", audio: "p10_wa.mp3" },
                { arabic: "يَ", name: "ياء بالفتحة", audio: "p11_yae.mp3" }
            ]
        },
        mainAudio: "p8_title.mp3"
    },
    {
        id: 9,
        title: "الدرس التاسع: الكلمات البسيطة - الجزء الأول",
        description: "تكوين كلمات بسيطة من الحروف",
        type: "words",
        content: {
            words: [
                { arabic: "بَابٌ", audio: "p11_word1.mp3" },
                { arabic: "تَابٌ", audio: "p11_word2.mp3" },
                { arabic: "جَابٌ", audio: "p11_word3.mp3" },
                { arabic: "دَابٌ", audio: "p11_word4.mp3" },
                { arabic: "رَابٌ", audio: "p11_word5.mp3" },
                { arabic: "سَابٌ", audio: "p11_word6.mp3" },
                { arabic: "شَابٌ", audio: "p11_word7.mp3" },
                { arabic: "صَابٌ", audio: "p11_word8.mp3" },
                { arabic: "ضَابٌ", audio: "p11_word9.mp3" },
                { arabic: "طَابٌ", audio: "p11_word10.mp3" }
            ]
        },
        mainAudio: "p9_title.mp3"
    },
    {
        id: 10,
        title: "الدرس العاشر: الكلمات البسيطة - الجزء الثاني",
        description: "المزيد من الكلمات البسيطة",
        type: "words",
        content: {
            words: [
                { arabic: "ظَابٌ", audio: "p11_word11.mp3" },
                { arabic: "عَابٌ", audio: "p11_word12.mp3" },
                { arabic: "غَابٌ", audio: "p11_word13.mp3" },
                { arabic: "فَابٌ", audio: "p11_word14.mp3" },
                { arabic: "قَابٌ", audio: "p11_word15.mp3" },
                { arabic: "كَابٌ", audio: "p11_word16.mp3" },
                { arabic: "لَابٌ", audio: "p11_word17.mp3" },
                { arabic: "مَابٌ", audio: "p11_word18.mp3" },
                { arabic: "نَابٌ", audio: "p11_word19.mp3" },
                { arabic: "هَابٌ", audio: "p11_word20.mp3" }
            ]
        },
        mainAudio: "p10_title.mp3"
    },
    {
        id: 11,
        title: "الدرس الحادي عشر: كلمات بالحركات المختلفة",
        description: "كلمات مع حركات مختلفة",
        type: "words",
        content: {
            words: [
                { arabic: "وَابٌ", audio: "p11_word21.mp3" },
                { arabic: "يَابٌ", audio: "p11_word22.mp3" },
                { arabic: "بُوبٌ", audio: "p11_word23.mp3" },
                { arabic: "تُوبٌ", audio: "p11_word24.mp3" },
                { arabic: "جُوبٌ", audio: "p11_word25.mp3" },
                { arabic: "دُوبٌ", audio: "p11_word26.mp3" },
                { arabic: "رُوبٌ", audio: "p11_word27.mp3" },
                { arabic: "سُوبٌ", audio: "p11_word28.mp3" },
                { arabic: "شُوبٌ", audio: "p11_word29.mp3" },
                { arabic: "صُوبٌ", audio: "p11_word30.mp3" }
            ]
        },
        mainAudio: "p11_title.mp3"
    },
    {
        id: 12,
        title: "الدرس الثاني عشر: كلمات متقدمة - الجزء الأول",
        description: "كلمات أكثر تعقيداً",
        type: "words",
        content: {
            words: [
                { arabic: "ضُوبٌ", audio: "p11_word31.mp3" },
                { arabic: "طُوبٌ", audio: "p11_word32.mp3" },
                { arabic: "ظُوبٌ", audio: "p11_word33.mp3" },
                { arabic: "عُوبٌ", audio: "p11_word34.mp3" },
                { arabic: "غُوبٌ", audio: "p11_word35.mp3" },
                { arabic: "فُوبٌ", audio: "p11_word36.mp3" },
                { arabic: "قُوبٌ", audio: "p11_word37.mp3" },
                { arabic: "كُوبٌ", audio: "p11_word38.mp3" },
                { arabic: "لُوبٌ", audio: "p11_word39.mp3" },
                { arabic: "مُوبٌ", audio: "p11_word40.mp3" }
            ]
        },
        mainAudio: "p12_title.mp3"
    },
    {
        id: 13,
        title: "الدرس الثالث عشر: كلمات متقدمة - الجزء الثاني",
        description: "كلمات تحتوي على الضمة",
        type: "words",
        content: {
            words: [
                { arabic: "نُوبٌ", audio: "p11_word41.mp3" },
                { arabic: "هُوبٌ", audio: "p11_word42.mp3" },
                { arabic: "بِيبٌ", audio: "p12_word1.mp3" },
                { arabic: "تِيبٌ", audio: "p12_word2.mp3" },
                { arabic: "جِيبٌ", audio: "p12_word3.mp3" },
                { arabic: "دِيبٌ", audio: "p12_word4.mp3" },
                { arabic: "رِيبٌ", audio: "p12_word5.mp3" },
                { arabic: "سِيبٌ", audio: "p12_word6.mp3" },
                { arabic: "شِيبٌ", audio: "p12_word7.mp3" },
                { arabic: "صِيبٌ", audio: "p12_word8.mp3" }
            ]
        },
        mainAudio: "p13_title.mp3"
    },
    {
        id: 14,
        title: "الدرس الرابع عشر: كلمات بالكسرة - الجزء الأول",
        description: "كلمات تحتوي على الكسرة",
        type: "words",
        content: {
            words: [
                { arabic: "ضِيبٌ", audio: "p12_word9.mp3" },
                { arabic: "طِيبٌ", audio: "p12_word10.mp3" },
                { arabic: "ظِيبٌ", audio: "p12_word11.mp3" },
                { arabic: "عِيبٌ", audio: "p12_word12.mp3" },
                { arabic: "غِيبٌ", audio: "p12_word13.mp3" },
                { arabic: "فِيبٌ", audio: "p12_word14.mp3" },
                { arabic: "قِيبٌ", audio: "p12_word15.mp3" },
                { arabic: "كِيبٌ", audio: "p12_word16.mp3" },
                { arabic: "لِيبٌ", audio: "p12_word17.mp3" },
                { arabic: "مِيبٌ", audio: "p12_word18.mp3" }
            ]
        },
        mainAudio: "p14_title.mp3"
    },
    {
        id: 15,
        title: "الدرس الخامس عشر: كلمات بالكسرة - الجزء الثاني",
        description: "كلمات أكثر تعقيداً وتركيباً",
        type: "words",
        content: {
            words: [
                { arabic: "نِيبٌ", audio: "p12_word19.mp3" },
                { arabic: "هِيبٌ", audio: "p12_word20.mp3" },
                { arabic: "وِيبٌ", audio: "p12_word21.mp3" },
                { arabic: "يِيبٌ", audio: "p12_word22.mp3" },
                { arabic: "بَيْتٌ", audio: "p12_word23.mp3" },
                { arabic: "تَيْتٌ", audio: "p12_word24.mp3" },
                { arabic: "جَيْتٌ", audio: "p12_word25.mp3" },
                { arabic: "دَيْتٌ", audio: "p12_word26.mp3" },
                { arabic: "رَيْتٌ", audio: "p12_word27.mp3" },
                { arabic: "سَيْتٌ", audio: "p12_word28.mp3" }
            ]
        },
        mainAudio: "p15_title.mp3"
    },
    {
        id: 16,
        title: "الدرس السادس عشر: كلمات مركبة متقدمة",
        description: "تكوين كلمات مركبة من الكلمات المتعلمة",
        type: "words",
        content: {
            words: [
                { arabic: "شَيْتٌ", audio: "p12_word29.mp3" },
                { arabic: "صَيْتٌ", audio: "p12_word30.mp3" },
                { arabic: "ضَيْتٌ", audio: "p12_word31.mp3" },
                { arabic: "طَيْتٌ", audio: "p12_word32.mp3" },
                { arabic: "ظَيْتٌ", audio: "p12_word33.mp3" },
                { arabic: "عَيْتٌ", audio: "p12_word34.mp3" },
                { arabic: "غَيْتٌ", audio: "p12_word35.mp3" },
                { arabic: "فَيْتٌ", audio: "p12_word36.mp3" },
                { arabic: "قَيْتٌ", audio: "p12_word37.mp3" },
                { arabic: "كَيْتٌ", audio: "p12_word38.mp3" }
            ]
        },
        mainAudio: "p16_title.mp3"
    },
    {
        id: 17,
        title: "الدرس السابع عشر: المراجعة النهائية والكلمات المتقدمة",
        description: "مراجعة شاملة لجميع ما تم تعلمه",
        type: "review",
        content: {
            words: [
                { arabic: "لَيْتٌ", audio: "p12_word39.mp3" },
                { arabic: "مَيْتٌ", audio: "p12_word40.mp3" },
                { arabic: "نَيْتٌ", audio: "p12_word41.mp3" },
                { arabic: "هَيْتٌ", audio: "p12_word42.mp3" },
                { arabic: "وَيْتٌ", audio: "p12_word43.mp3" },
                { arabic: "يَيْتٌ", audio: "p12_word44.mp3" },
                { arabic: "مَدْرَسَةٌ", audio: "p12_word45.mp3" },
                { arabic: "كِتَابٌ", audio: "p12_word46.mp3" },
                { arabic: "قَلَمٌ", audio: "p12_word47.mp3" },
                { arabic: "طَالِبٌ", audio: "p12_word48.mp3" }
            ]
        },
        mainAudio: "p17_title.mp3"
    }
];

// Extended Audio file mappings for different lesson types
const audioMappings = {
    letters: {
        baseAudio: "basmla.mp3"
    },
    harakat: {
        // All p10 harakat combinations
        combinations: [
            "p10_3ae.mp3", "p10_3ao.mp3", "p10_5ae.mp3", "p10_5ao.mp3",
            "p10_7ae.mp3", "p10_7ao.mp3", "p10_aae.mp3", "p10_aao.mp3",
            "p10_bae.mp3", "p10_bao.mp3", "p10_dae.mp3", "p10_dao.mp3",
            "p10_ddae.mp3", "p10_ddao.mp3", "p10_fae.mp3", "p10_fao.mp3",
            "p10_gae.mp3", "p10_gao.mp3", "p10_ghae.mp3", "p10_gha.mp3",
            "p10_ghao.mp3", "p10_ghe.mp3", "p10_gho.mp3", "p10_kae.mp3",
            "p10_ka.mp3", "p10_kao.mp3", "p10_ke.mp3", "p10_ko.mp3",
            "p10_lae.mp3", "p10_la.mp3", "p10_lao.mp3", "p10_le.mp3",
            "p10_lo.mp3", "p10_ma.mp3", "p10_mao.mp3", "p10_me.mp3",
            "p10_mo.mp3", "p10_nae.mp3", "p10_na.mp3", "p10_nao.mp3",
            "p10_ne.mp3", "p10_no.mp3", "p10_qae.mp3", "p10_qa.mp3",
            "p10_qao.mp3", "p10_qe.mp3", "p10_qo.mp3", "p10_rae.mp3",
            "p10_rao.mp3", "p10_sae.mp3", "p10_sao.mp3", "p10_shae.mp3",
            "p10_shao.mp3", "p10_ssae.mp3", "p10_ssao.mp3", "p10_tae.mp3",
            "p10_tao.mp3", "p10_thae.mp3", "p10_thao.mp3", "p10_ttae.mp3",
            "p10_ttao.mp3", "p10_wa.mp3", "p10_we.mp3", "p10_wo.mp3",
            "p10_zae.mp3", "p10_zale.mp3", "p10_zalo.mp3", "p10_zao.mp3",
            "p10_zzae.mp3", "p10_zzao.mp3"
        ]
    },
    words: {
        // All p11 words (42 words)
        p11_words: [
            "p11_word1.mp3", "p11_word2.mp3", "p11_word3.mp3", "p11_word4.mp3",
            "p11_word5.mp3", "p11_word6.mp3", "p11_word7.mp3", "p11_word8.mp3",
            "p11_word9.mp3", "p11_word10.mp3", "p11_word11.mp3", "p11_word12.mp3",
            "p11_word13.mp3", "p11_word14.mp3", "p11_word15.mp3", "p11_word16.mp3",
            "p11_word17.mp3", "p11_word18.mp3", "p11_word19.mp3", "p11_word20.mp3",
            "p11_word21.mp3", "p11_word22.mp3", "p11_word23.mp3", "p11_word24.mp3",
            "p11_word25.mp3", "p11_word26.mp3", "p11_word27.mp3", "p11_word28.mp3",
            "p11_word29.mp3", "p11_word30.mp3", "p11_word31.mp3", "p11_word32.mp3",
            "p11_word33.mp3", "p11_word34.mp3", "p11_word35.mp3", "p11_word36.mp3",
            "p11_word37.mp3", "p11_word38.mp3", "p11_word39.mp3", "p11_word40.mp3",
            "p11_word41.mp3", "p11_word42.mp3"
        ],
        // All p12 words (57 words)
        p12_words: [
            "p12_word1.mp3", "p12_word2.mp3", "p12_word3.mp3", "p12_word4.mp3",
            "p12_word5.mp3", "p12_word6.mp3", "p12_word7.mp3", "p12_word8.mp3",
            "p12_word9.mp3", "p12_word10.mp3", "p12_word11.mp3", "p12_word12.mp3",
            "p12_word13.mp3", "p12_word14.mp3", "p12_word15.mp3", "p12_word16.mp3",
            "p12_word17.mp3", "p12_word18.mp3", "p12_word19.mp3", "p12_word20.mp3",
            "p12_word21.mp3", "p12_word22.mp3", "p12_word23.mp3", "p12_word24.mp3",
            "p12_word25.mp3", "p12_word26.mp3", "p12_word27.mp3", "p12_word28.mp3",
            "p12_word29.mp3", "p12_word30.mp3", "p12_word31.mp3", "p12_word32.mp3",
            "p12_word33.mp3", "p12_word34.mp3", "p12_word35.mp3", "p12_word36.mp3",
            "p12_word37.mp3", "p12_word38.mp3", "p12_word39.mp3", "p12_word40.mp3",
            "p12_word41.mp3", "p12_word42.mp3", "p12_word43.mp3", "p12_word44.mp3",
            "p12_word45.mp3", "p12_word46.mp3", "p12_word47.mp3", "p12_word48.mp3",
            "p12_word49.mp3", "p12_word50.mp3", "p12_word51.mp3", "p12_word52.mp3",
            "p12_word53.mp3", "p12_wor
