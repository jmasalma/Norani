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
        title: "الدرس الخامس: الحركات - الفتحة",
        description: "تعلم الفتحة على جميع الحروف",
        type: "harakat",
        content: {
            letters: [
                { arabic: "بَ", name: "با بالفتحة", audio: "p10_bae.mp3" },
                { arabic: "تَ", name: "تا بالفتحة", audio: "p10_tae.mp3" },
                { arabic: "ثَ", name: "ثا بالفتحة", audio: "p10_thae.mp3" },
                { arabic: "جَ", name: "جيم بالفتحة", audio: "p10_gae.mp3" },
                { arabic: "دَ", name: "دال بالفتحة", audio: "p10_dae.mp3" },
                { arabic: "رَ", name: "راء بالفتحة", audio: "p10_rae.mp3" },
                { arabic: "زَ", name: "زاي بالفتحة", audio: "p10_zae.mp3" },
                { arabic: "سَ", name: "سين بالفتحة", audio: "p10_sae.mp3" },
                { arabic: "شَ", name: "شين بالفتحة", audio: "p10_shae.mp3" },
                { arabic: "صَ", name: "صاد بالفتحة", audio: "p10_ssae.mp3" },
                { arabic: "ضَ", name: "ضاد بالفتحة", audio: "p10_ddae.mp3" },
                { arabic: "طَ", name: "طاء بالفتحة", audio: "p10_ttae.mp3" },
                { arabic: "ظَ", name: "ظاء بالفتحة", audio: "p10_zzae.mp3" },
                { arabic: "عَ", name: "عين بالفتحة", audio: "p10_3ae.mp3" },
                { arabic: "غَ", name: "غين بالفتحة", audio: "p10_ghae.mp3" },
                { arabic: "فَ", name: "فاء بالفتحة", audio: "p10_fae.mp3" },
                { arabic: "قَ", name: "قاف بالفتحة", audio: "p10_qae.mp3" },
                { arabic: "كَ", name: "كاف بالفتحة", audio: "p10_kae.mp3" },
                { arabic: "لَ", name: "لام بالفتحة", audio: "p10_lae.mp3" },
                { arabic: "مَ", name: "ميم بالفتحة", audio: "p10_ma.mp3" },
                { arabic: "نَ", name: "نون بالفتحة", audio: "p10_nae.mp3" },
                { arabic: "هَ", name: "هاء بالفتحة", audio: "p11_hae.mp3" },
                { arabic: "وَ", name: "واو بالفتحة", audio: "p10_wa.mp3" },
                { arabic: "يَ", name: "ياء بالفتحة", audio: "p11_yae.mp3" }
            ]
        },
        mainAudio: "p5_title.mp3"
    },
    {
        id: 6,
        title: "الدرس السادس: الحركات - الضمة",
        description: "تعلم الضمة على جميع الحروف",
        type: "harakat",
        content: {
            letters: [
                { arabic: "بُ", name: "با بالضمة", audio: "p10_bao.mp3" },
                { arabic: "تُ", name: "تا بالضمة", audio: "p10_tao.mp3" },
                { arabic: "ثُ", name: "ثا بالضمة", audio: "p10_thao.mp3" },
                { arabic: "جُ", name: "جيم بالضمة", audio: "p10_gao.mp3" },
                { arabic: "دُ", name: "دال بالضمة", audio: "p10_dao.mp3" },
                { arabic: "رُ", name: "راء بالضمة", audio: "p10_rao.mp3" },
                { arabic: "زُ", name: "زاي بالضمة", audio: "p10_zao.mp3" },
                { arabic: "سُ", name: "سين بالضمة", audio: "p10_sao.mp3" },
                { arabic: "شُ", name: "شين بالضمة", audio: "p10_shao.mp3" },
                { arabic: "صُ", name: "صاد بالضمة", audio: "p10_ssao.mp3" },
                { arabic: "ضُ", name: "ضاد بالضمة", audio: "p10_ddao.mp3" },
                { arabic: "طُ", name: "طاء بالضمة", audio: "p10_ttao.mp3" },
                { arabic: "ظُ", name: "ظاء بالضمة", audio: "p10_zzao.mp3" },
                { arabic: "عُ", name: "عين بالضمة", audio: "p10_3ao.mp3" },
                { arabic: "غُ", name: "غين بالضمة", audio: "p10_ghao.mp3" },
                { arabic: "فُ", name: "فاء بالضمة", audio: "p10_fao.mp3" },
                { arabic: "قُ", name: "قاف بالضمة", audio: "p10_qao.mp3" },
                { arabic: "كُ", name: "كاف بالضمة", audio: "p10_kao.mp3" },
                { arabic: "لُ", name: "لام بالضمة", audio: "p10_lao.mp3" },
                { arabic: "مُ", name: "ميم بالضمة", audio: "p10_mao.mp3" },
                { arabic: "نُ", name: "نون بالضمة", audio: "p10_nao.mp3" },
                { arabic: "هُ", name: "هاء بالضمة", audio: "p11_hao.mp3" },
                { arabic: "وُ", name: "واو بالضمة", audio: "p10_wo.mp3" },
                { arabic: "يُ", name: "ياء بالضمة", audio: "p11_yao.mp3" }
            ]
        },
        mainAudio: "p6_title.mp3"
    },
    {
        id: 7,
        title: "الدرس السابع: الحركات - الكسرة",
        description: "تعلم الكسرة على جميع الحروف",
        type: "harakat",
        content: {
            letters: [
                { arabic: "بِ", name: "با بالكسرة", audio: "p6_b1.mp3" },
                { arabic: "تِ", name: "تا بالكسرة", audio: "p6_t1.mp3" },
                { arabic: "ثِ", name: "ثا بالكسرة", audio: "p6_tha1.mp3" },
                { arabic: "جِ", name: "جيم بالكسرة", audio: "p6_g1.mp3" },
                { arabic: "دِ", name: "دال بالكسرة", audio: "p6_d1.mp3" },
                { arabic: "رِ", name: "راء بالكسرة", audio: "p6_r1.mp3" },
                { arabic: "زِ", name: "زاي بالكسرة", audio: "p6_za1.mp3" },
                { arabic: "سِ", name: "سين بالكسرة", audio: "p6_s1.mp3" },
                { arabic: "شِ", name: "شين بالكسرة", audio: "p6_sh1.mp3" },
                { arabic: "صِ", name: "صاد بالكسرة", audio: "p6_ss1.mp3" },
                { arabic: "ضِ", name: "ضاد بالكسرة", audio: "p6_dd1.mp3" },
                { arabic: "طِ", name: "طاء بالكسرة", audio: "p6_tt1.mp3" },
                { arabic: "ظِ", name: "ظاء بالكسرة", audio: "p6_zza1.mp3" },
                { arabic: "عِ", name: "عين بالكسرة", audio: "p7_31.mp3" },
                { arabic: "غِ", name: "غين بالكسرة", audio: "p7_gh1.mp3" },
                { arabic: "فِ", name: "فاء بالكسرة", audio: "p6_f1.mp3" },
                { arabic: "قِ", name: "قاف بالكسرة", audio: "p6_q1.mp3" },
                { arabic: "كِ", name: "كاف بالكسرة", audio: "p6_k1.mp3" },
                { arabic: "لِ", name: "لام بالكسرة", audio: "p6_l1.mp3" },
                { arabic: "مِ", name: "ميم بالكسرة", audio: "p6_m1.mp3" },
                { arabic: "نِ", name: "نون بالكسرة", audio: "p6_n1.mp3" },
                { arabic: "هِ", name: "هاء بالكسرة", audio: "p7_h1.mp3" },
                { arabic: "وِ", name: "واو بالكسرة", audio: "p6_w1.mp3" },
                { arabic: "يِ", name: "ياء بالكسرة", audio: "p6_y1.mp3" }
            ]
        },
        mainAudio: "p7_title.mp3"
    },
    {
        id: 8,
        title: "الدرس الثامن: التنوين",
        description: "تعلم التنوين بأنواعه الثلاثة",
        type: "harakat",
        content: {
            letters: [
                { arabic: "بٌ", name: "با بتنوين الضم", audio: "p6_b2.mp3" },
                { arabic: "تٌ", name: "تا بتنوين الضم", audio: "p6_t2.mp3" },
                { arabic: "ثٌ", name: "ثا بتنوين الضم", audio: "p6_tha2.mp3" },
                { arabic: "جٌ", name: "جيم بتنوين الضم", audio: "p6_g2.mp3" },
                { arabic: "دٌ", name: "دال بتنوين الضم", audio: "p6_d2.mp3" },
                { arabic: "رٌ", name: "راء بتنوين الضم", audio: "p6_r2.mp3" },
                { arabic: "زٌ", name: "زاي بتنوين الضم", audio: "p6_za2.mp3" },
                { arabic: "سٌ", name: "سين بتنوين الضم", audio: "p6_s2.mp3" },
                { arabic: "شٌ", name: "شين بتنوين الضم", audio: "p6_sh2.mp3" },
                { arabic: "صٌ", name: "صاد بتنوين الضم", audio: "p6_ss2.mp3" },
                { arabic: "ضٌ", name: "ضاد بتنوين الضم", audio: "p6_dd2.mp3" },
                { arabic: "طٌ", name: "طاء بتنوين الضم", audio: "p6_tt2.mp3" },
                { arabic: "ظٌ", name: "ظاء بتنوين الضم", audio: "p6_zza2.mp3" },
                { arabic: "عٌ", name: "عين بتنوين الضم", audio: "p7_32.mp3" },
                { arabic: "غٌ", name: "غين بتنوين الضم", audio: "p7_gh2.mp3" },
                { arabic: "فٌ", name: "فاء بتنوين الضم", audio: "p6_f2.mp3" },
                { arabic: "قٌ", name: "قاف بتنوين الضم", audio: "p7_q2.mp3" },
                { arabic: "كٌ", name: "كاف بتنوين الضم", audio: "p6_k2.mp3" },
                { arabic: "لٌ", name: "لام بتنوين الضم", audio: "p6_l2.mp3" },
                { arabic: "مٌ", name: "ميم بتنوين الضم", audio: "p6_m2.mp3" },
                { arabic: "نٌ", name: "نون بتنوين الضم", audio: "p6_n2.mp3" },
                { arabic: "هٌ", name: "هاء بتنوين الضم", audio: "p7_h2.mp3" },
                { arabic: "وٌ", name: "واو بتنوين الضم", audio: "p6_w2.mp3" },
                { arabic: "يٌ", name: "ياء بتنوين الضم", audio: "p6_y2.mp3" }
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
                { arabic: "طَابٌ", audio: "p11_word10.mp3" },
                { arabic: "ظَابٌ", audio: "p11_word11.mp3" },
                { arabic: "عَابٌ", audio: "p11_word12.mp3" },
                { arabic: "غَابٌ", audio: "p11_word13.mp3" },
                { arabic: "فَابٌ", audio: "p11_word14.mp3" },
                { arabic: "قَابٌ", audio: "p11_word15.mp3" },
                { arabic: "كَابٌ", audio: "p11_word16.mp3" },
                { arabic: "لَابٌ", audio: "p11_word17.mp3" },
                { arabic: "مَابٌ", audio: "p11_word18.mp3" }
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
                { arabic: "نَابٌ", audio: "p11_word19.mp3" },
                { arabic: "هَابٌ", audio: "p11_word20.mp3" },
                { arabic: "وَابٌ", audio: "p11_word21.mp3" },
                { arabic: "يَابٌ", audio: "p11_word22.mp3" },
                { arabic: "بُوبٌ", audio: "p11_word23.mp3" },
                { arabic: "تُوبٌ", audio: "p11_word24.mp3" },
                { arabic: "جُوبٌ", audio: "p11_word25.mp3" },
                { arabic: "دُوبٌ", audio: "p11_word26.mp3" },
                { arabic: "رُوبٌ", audio: "p11_word27.mp3" },
                { arabic: "سُوبٌ", audio: "p11_word28.mp3" },
                { arabic: "شُوبٌ", audio: "p11_word29.mp3" },
                { arabic: "صُوبٌ", audio: "p11_word30.mp3" },
                { arabic: "ضُوبٌ", audio: "p11_word31.mp3" },
                { arabic: "طُوبٌ", audio: "p11_word32.mp3" },
                { arabic: "ظُوبٌ", audio: "p11_word33.mp3" },
                { arabic: "عُوبٌ", audio: "p11_word34.mp3" },
                { arabic: "غُوبٌ", audio: "p11_word35.mp3" },
                { arabic: "فُوبٌ", audio: "p11_word36.mp3" }
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
                { arabic: "قُوبٌ", audio: "p11_word37.mp3" },
                { arabic: "كُوبٌ", audio: "p11_word38.mp3" },
                { arabic: "لُوبٌ", audio: "p11_word39.mp3" },
                { arabic: "مُوبٌ", audio: "p11_word40.mp3" },
                { arabic: "نُوبٌ", audio: "p11_word41.mp3" },
                { arabic: "هُوبٌ", audio: "p11_word42.mp3" },
                { arabic: "بِيبٌ", audio: "p12_word1.mp3" },
                { arabic: "تِيبٌ", audio: "p12_word2.mp3" },
                { arabic: "جِيبٌ", audio: "p12_word3.mp3" },
                { arabic: "دِيبٌ", audio: "p12_word4.mp3" },
                { arabic: "رِيبٌ", audio: "p12_word5.mp3" },
                { arabic: "سِيبٌ", audio: "p12_word6.mp3" },
                { arabic: "شِيبٌ", audio: "p12_word7.mp3" },
                { arabic: "صِيبٌ", audio: "p12_word8.mp3" },
                { arabic: "ضِيبٌ", audio: "p12_word9.mp3" },
                { arabic: "طِيبٌ", audio: "p12_word10.mp3" },
                { arabic: "ظِيبٌ", audio: "p12_word11.mp3" },
                { arabic: "عِيبٌ", audio: "p12_word12.mp3" }
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
                { arabic: "غِيبٌ", audio: "p12_word13.mp3" },
                { arabic: "فِيبٌ", audio: "p12_word14.mp3" },
                { arabic: "قِيبٌ", audio: "p12_word15.mp3" },
                { arabic: "كِيبٌ", audio: "p12_word16.mp3" },
                { arabic: "لِيبٌ", audio: "p12_word17.mp3" },
                { arabic: "مِيبٌ", audio: "p12_word18.mp3" },
                { arabic: "نِيبٌ", audio: "p12_word19.mp3" },
                { arabic: "هِيبٌ", audio: "p12_word20.mp3" },
                { arabic: "وِيبٌ", audio: "p12_word21.mp3" },
                { arabic: "يِيبٌ", audio: "p12_word22.mp3" },
                { arabic: "بَيْتٌ", audio: "p12_word23.mp3" },
                { arabic: "تَيْتٌ", audio: "p12_word24.mp3" },
                { arabic: "جَيْتٌ", audio: "p12_word25.mp3" },
                { arabic: "دَيْتٌ", audio: "p12_word26.mp3" },
                { arabic: "رَيْتٌ", audio: "p12_word27.mp3" },
                { arabic: "سَيْتٌ", audio: "p12_word28.mp3" },
                { arabic: "شَيْتٌ", audio: "p12_word29.mp3" },
                { arabic: "صَيْتٌ", audio: "p12_word30.mp3" }
            ]
        },
        mainAudio: "p12_title.mp3"
    },
    {
        id: 13,
        title: "الدرس الثالث عشر: كلمات متقدمة - الجزء الثاني",
        description: "كلمات تحتوي على الكسرة",
        type: "words",
        content: {
            words: [
                { arabic: "ضَيْتٌ", audio: "p12_word31.mp3" },
                { arabic: "طَيْتٌ", audio: "p12_word32.mp3" },
                { arabic: "ظَيْتٌ", audio: "p12_word33.mp3" },
                { arabic: "عَيْتٌ", audio: "p12_word34.mp3" },
                { arabic: "غَيْتٌ", audio: "p12_word35.mp3" },
                { arabic: "فَيْتٌ", audio: "p12_word36.mp3" },
                { arabic: "قَيْتٌ", audio: "p12_word37.mp3" },
                { arabic: "كَيْتٌ", audio: "p12_word38.mp3" },
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
        mainAudio: "p13_title.mp3"
    },
    {
        id: 14,
        title: "الدرس الرابع عشر: كلمات بالكسرة المتقدمة",
        description: "كلمات تحتوي على الكسرة المتقدمة",
        type: "words",
        content: {
            words: [
                { arabic: "مُعَلِّمٌ", audio: "p12_word49.mp3" },
                { arabic: "صَفٌّ", audio: "p12_word50.mp3" },
                { arabic: "بَابٌ", audio: "p12_word51.mp3" },
                { arabic: "نَافِذَةٌ", audio: "p12_word52.mp3" },
                { arabic: "كُرْسِيٌّ", audio: "p12_word53.mp3" },
                { arabic: "طَاوِلَةٌ", audio: "p12_word54.mp3" },
                { arabic: "سَبُّورَةٌ", audio: "p12_word55.mp3" },
                { arabic: "مِمْحَاةٌ", audio: "p12_word56.mp3" },
                { arabic: "حَقِيبَةٌ", audio: "p12_word57.mp3" },
                { arabic: "وَرَقَةٌ", audio: "p13_word1.mp3" },
                { arabic: "دَفْتَرٌ", audio: "p13_word2.mp3" },
                { arabic: "مِسْطَرَةٌ", audio: "p14_word1.mp3" },
                { arabic: "أَلْوَانٌ", audio: "p14_word2.mp3" },
                { arabic: "رَسْمٌ", audio: "p14_word3.mp3" },
                { arabic: "صُورَةٌ", audio: "p14_word4.mp3" },
                { arabic: "خَرِيطَةٌ", audio: "p14_word5.mp3" },
                { arabic: "سَاعَةٌ", audio: "p14_word6.mp3" },
                { arabic: "تَقْوِيمٌ", audio: "p14_word7.mp3" }
            ]
        },
        mainAudio: "p14_title.mp3"
    },
    {
        id: 15,
        title: "الدرس الخامس عشر: كلمات مركبة متقدمة",
        description: "كلمات أكثر تعقيداً وتركيباً",
        type: "words",
        content: {
            words: [
                { arabic: "مَكْتَبَةٌ", audio: "p14_word8.mp3" },
                { arabic: "حَدِيقَةٌ", audio: "p14_word9.mp3" },
                { arabic: "مَطْبَخٌ", audio: "p14_word10.mp3" },
                { arabic: "غُرْفَةٌ", audio: "p14_word11.mp3" },
                { arabic: "حَمَّامٌ", audio: "p14_word12.mp3" },
                { arabic: "شُبَّاكٌ", audio: "p14_word13.mp3" },
                { arabic: "مِفْتَاحٌ", audio: "p14_word14.mp3" },
                { arabic: "هَاتِفٌ", audio: "p14_word15.mp3" },
                { arabic: "تِلْفَازٌ", audio: "p14_word16.mp3" },
                { arabic: "رَادِيُو", audio: "p14_word17.mp3" },
                { arabic: "حَاسُوبٌ", audio: "p14_word18.mp3" },
                { arabic: "إِنْتَرْنِت", audio: "p14_word19.mp3" },
                { arabic: "مَوْقِعٌ", audio: "p14_word20.mp3" },
                { arabic: "بَرِيدٌ", audio: "p14_word21.mp3" },
                { arabic: "رِسَالَةٌ", audio: "p14_word22.mp3" },
                { arabic: "عُنْوَانٌ", audio: "p14_word23.mp3" },
                { arabic: "رَقَمٌ", audio: "p14_word24.mp3" },
                { arabic: "اِسْمٌ", audio: "p14_word25.mp3" }
            ]
        },
        mainAudio: "p15_title.mp3"
    },
    {
        id: 16,
        title: "الدرس السادس عشر: كلمات وجمل متقدمة",
        description: "تكوين كلمات وجمل من الكلمات المتعلمة",
        type: "sentences",
        content: {
            words: [
                { arabic: "عَائِلَةٌ", audio: "p14_word26.mp3" },
                { arabic: "أَبٌ", audio: "p14_word27.mp3" },
                { arabic: "أُمٌّ", audio: "p14_word28.mp3" },
                { arabic: "أَخٌ", audio: "p14_word29.mp3" },
                { arabic: "أُخْتٌ", audio: "p14_word30.mp3" },
                { arabic: "جَدٌّ", audio: "p15_word1.mp3" },
                { arabic: "جَدَّةٌ", audio: "p15_word2.mp3" },
                { arabic: "عَمٌّ", audio: "p15_word3.mp3" },
                { arabic: "عَمَّةٌ", audio: "p15_word4.mp3" },
                { arabic: "خَالٌ", audio: "p15_word5.mp3" },
                { arabic: "خَالَةٌ", audio: "p15_word6.mp3" },
                { arabic: "ابْنٌ", audio: "p15_word7.mp3" },
                { arabic: "بِنْتٌ", audio: "p15_word8.mp3" },
                { arabic: "صَدِيقٌ", audio: "p15_word9.mp3" },
                { arabic: "جَارٌ", audio: "p15_word10.mp3" },
                { arabic: "ضَيْفٌ", audio: "p15_word11.mp3" },
                { arabic: "زَائِرٌ", audio: "p15_word12.mp3" },
                { arabic: "مُسَافِرٌ", audio: "p15_word13.mp3" }
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
                { arabic: "مَدِينَةٌ", audio: "p15_word14.mp3" },
                { arabic: "قَرْيَةٌ", audio: "p15_word15.mp3" },
                { arabic: "شَارِعٌ", audio: "p15_word16.mp3" },
                { arabic: "طَرِيقٌ", audio: "p15_word17.mp3" },
                { arabic: "جِسْرٌ", audio: "p15_word18.mp3" },
                { arabic: "مَحَطَّةٌ", audio: "p15_word19.mp3" },
                { arabic: "مَطَارٌ", audio: "p15_word20.mp3" },
                { arabic: "مُسْتَشْفَى", audio: "p16_word1.mp3" },
                { arabic: "صَيْدَلِيَّةٌ", audio: "p16_word2.mp3" },
                { arabic: "مَطْعَمٌ", audio: "p16_word3.mp3" },
                { arabic: "فُنْدُقٌ", audio: "p16_word4.mp3" },
                { arabic: "مَتْجَرٌ", audio: "p16_word5.mp3" },
                { arabic: "سُوقٌ", audio: "p16_word6.mp3" },
                { arabic: "بَنْكٌ", audio: "p16_word7.mp3" },
                { arabic: "مَكْتَبٌ", audio: "p16_word8.mp3" },
                { arabic: "مَصْنَعٌ", audio: "p16_word9.mp3" },
                { arabic: "حَقْلٌ", audio: "p16_word10.mp3" },
                { arabic: "بُسْتَانٌ", audio: "p16_word11.mp3" },
                // Additional p17-p23 series words
                { arabic: "مَزْرَعَةٌ", audio: "p17_word1.mp3" },
                { arabic: "حَيَوَانٌ", audio: "p17_word2.mp3" },
                { arabic: "طَائِرٌ", audio: "p17_word3.mp3" },
                { arabic: "سَمَكٌ", audio: "p17_word4.mp3" },
                { arabic: "شَجَرَةٌ", audio: "p17_word5.mp3" },
                { arabic: "وَرْدَةٌ", audio: "p17_word6.mp3" },
                { arabic: "نَهْرٌ", audio: "p17_word7.mp3" },
                { arabic: "بَحْرٌ", audio: "p17_word8.mp3" },
                { arabic: "جَبَلٌ", audio: "p17_word9.mp3" },
                { arabic: "صَحْرَاءُ", audio: "p17_word10.mp3" },
                { arabic: "غَابَةٌ", audio: "p17_word11.mp3" },
                { arabic: "سَمَاءٌ", audio: "p17_word12.mp3" },
                { arabic: "شَمْسٌ", audio: "p17_word13.mp3" },
                { arabic: "قَمَرٌ", audio: "p17_word14.mp3" },
                { arabic: "نَجْمٌ", audio: "p17_word15.mp3" },
                { arabic: "غَيْمٌ", audio: "p17_word16.mp3" },
                { arabic: "مَطَرٌ", audio: "p17_word17.mp3" },
                { arabic: "رِيحٌ", audio: "p17_word18.mp3" },
                { arabic: "ثَلْجٌ", audio: "p17_word19.mp3" },
                { arabic: "بَرْدٌ", audio: "p17_word20.mp3" },
                // P18 series
                { arabic: "حَرٌّ", audio: "p18_word1.mp3" },
                { arabic: "دَافِئٌ", audio: "p18_word2.mp3" },
                { arabic: "بَارِدٌ", audio: "p18_word3.mp3" },
                { arabic: "جَمِيلٌ", audio: "p18_word4.mp3" },
                { arabic: "قَبِيحٌ", audio: "p18_word5.mp3" },
                { arabic: "كَبِيرٌ", audio: "p18_word6.mp3" },
                { arabic: "صَغِيرٌ", audio: "p18_word7.mp3" },
                { arabic: "طَوِيلٌ", audio: "p18_word8.mp3" },
                { arabic: "قَصِيرٌ", audio: "p18_word9.mp3" },
                { arabic: "عَرِيضٌ", audio: "p18_word10.mp3" },
                { arabic: "ضَيِّقٌ", audio: "p18_word11.mp3" },
                { arabic: "سَرِيعٌ", audio: "p18_word12.mp3" },
                { arabic: "بَطِيءٌ", audio: "p18_word13.mp3" },
                { arabic: "قَوِيٌّ", audio: "p18_word14.mp3" },
                { arabic: "ضَعِيفٌ", audio: "p18_word15.mp3" },
                { arabic: "ذَكِيٌّ", audio: "p18_word16.mp3" },
                { arabic: "غَبِيٌّ", audio: "p18_word17.mp3" },
                { arabic: "سَعِيدٌ", audio: "p18_word18.mp3" },
                { arabic: "حَزِينٌ", audio: "p18_word19.mp3" },
                { arabic: "غَضْبَانُ", audio: "p18_word20.mp3" },
                // P19 series
                { arabic: "فَرِحٌ", audio: "p19_word1.mp3" },
                { arabic: "خَائِفٌ", audio: "p19_word2.mp3" },
                { arabic: "شُجَاعٌ", audio: "p19_word3.mp3" },
                { arabic: "جَبَانٌ", audio: "p19_word4.mp3" },
                { arabic: "صَادِقٌ", audio: "p19_word5.mp3" },
                { arabic: "كَاذِبٌ", audio: "p19_word6.mp3" },
                { arabic: "أَمِينٌ", audio: "p19_word7.mp3" },
                { arabic: "خَائِنٌ", audio: "p19_word8.mp3" },
                { arabic: "كَرِيمٌ", audio: "p19_word9.mp3" },
                { arabic: "بَخِيلٌ", audio: "p19_word10.mp3" },
                { arabic: "مُهَذَّبٌ", audio: "p19_word11.mp3" },
                { arabic: "وَقِحٌ", audio: "p19_word12.mp3" },
                { arabic: "نَظِيفٌ", audio: "p19_word13.mp3" },
                { arabic: "قَذِرٌ", audio: "p19_word14.mp3" },
                { arabic: "مُرَتَّبٌ", audio: "p19_word15.mp3" },
                { arabic: "فَوْضَوِيٌّ", audio: "p19_word16.mp3" },
                { arabic: "هَادِئٌ", audio: "p19_word17.mp3" },
                { arabic: "صَاخِبٌ", audio: "p19_word18.mp3" },
                { arabic: "مُجْتَهِدٌ", audio: "p19_word19.mp3" },
                { arabic: "كَسْلَانُ", audio: "p19_word20.mp3" },
                // P20 series
                { arabic: "نَشِيطٌ", audio: "p20_word1.mp3" },
                { arabic: "خَامِلٌ", audio: "p20_word2.mp3" },
                { arabic: "مُفِيدٌ", audio: "p20_word3.mp3" },
                { arabic: "ضَارٌّ", audio: "p20_word4.mp3" },
                { arabic: "مُمْتِعٌ", audio: "p20_word5.mp3" },
                { arabic: "مُمِلٌّ", audio: "p20_word6.mp3" },
                { arabic: "سَهْلٌ", audio: "p20_word7.mp3" },
                { arabic: "صَعْبٌ", audio: "p20_word8.mp3" },
                { arabic: "بَسِيطٌ", audio: "p20_word9.mp3" },
                { arabic: "مُعَقَّدٌ", audio: "p20_word10.mp3" },
                { arabic: "وَاضِحٌ", audio: "p20_word11.mp3" },
                { arabic: "غَامِضٌ", audio: "p20_word12.mp3" },
                { arabic: "مَشْهُورٌ", audio: "p20_word13.mp3" },
                { arabic: "مَجْهُولٌ", audio: "p20_word14.mp3" },
                { arabic: "قَدِيمٌ", audio: "p20_word15.mp3" },
                { arabic: "جَدِيدٌ", audio: "p20_word16.mp3" },
                { arabic: "حَدِيثٌ", audio: "p20_word17.mp3" },
                { arabic: "عَتِيقٌ", audio: "p20_word18.mp3" },
                { arabic: "غَالٍ", audio: "p20_word19.mp3" },
                { arabic: "رَخِيصٌ", audio: "p20_word20.mp3" },
                // P21 series
                { arabic: "مُكَلِّفٌ", audio: "p21_word1.mp3" },
                { arabic: "مَجَّانِيٌّ", audio: "p21_word2.mp3" },
                { arabic: "مُتَاحٌ", audio: "p21_word3.mp3" },
                { arabic: "مَمْنُوعٌ", audio: "p21_word4.mp3" },
                { arabic: "مَسْمُوحٌ", audio: "p21_word5.mp3" },
                { arabic: "مُحَرَّمٌ", audio: "p21_word6.mp3" },
                { arabic: "حَلَالٌ", audio: "p21_word7.mp3" },
                { arabic: "حَرَامٌ", audio: "p21_word8.mp3" },
                { arabic: "صَحِيحٌ", audio: "p21_word9.mp3" },
                { arabic: "خَطَأٌ", audio: "p21_word10.mp3" },
                { arabic: "صَوَابٌ", audio: "p21_word11.mp3" },
                { arabic: "غَلَطٌ", audio: "p21_word12.mp3" },
                { arabic: "حَقٌّ", audio: "p21_word13.mp3" },
                { arabic: "بَاطِلٌ", audio: "p21_word14.mp3" },
                { arabic: "عَدْلٌ", audio: "p21_word15.mp3" },
                { arabic: "ظُلْمٌ", audio: "p21_word16.mp3" },
                { arabic: "سَلَامٌ", audio: "p21_word17.mp3" },
                { arabic: "حَرْبٌ", audio: "p21_word18.mp3" },
                { arabic: "أَمْنٌ", audio: "p21_word19.mp3" },
                { arabic: "خَوْفٌ", audio: "p21_word20.mp3" },
                // P22 series
                { arabic: "أَمَلٌ", audio: "p22_word1.mp3" },
                { arabic: "يَأْسٌ", audio: "p22_word2.mp3" },
                { arabic: "فَرَحٌ", audio: "p22_word3.mp3" },
                { arabic: "حُزْنٌ", audio: "p22_word4.mp3" },
                { arabic: "سُرُورٌ", audio: "p22_word5.mp3" },
                { arabic: "غَمٌّ", audio: "p22_word6.mp3" },
                { arabic: "رَاحَةٌ", audio: "p22_word7.mp3" },
                { arabic: "تَعَبٌ", audio: "p22_word8.mp3" },
                { arabic: "نَشَاطٌ", audio: "p22_word9.mp3" },
                { arabic: "كَسَلٌ", audio: "p22_word10.mp3" },
                { arabic: "عَمَلٌ", audio: "p22_word11.mp3" },
                { arabic: "بَطَالَةٌ", audio: "p22_word12.mp3" },
                { arabic: "نَجَاحٌ", audio: "p22_word13.mp3" },
                { arabic: "فَشَلٌ", audio: "p22_word14.mp3" },
                { arabic: "فَوْزٌ", audio: "p22_word15.mp3" },
                { arabic: "خَسَارَةٌ", audio: "p22_word16.mp3" },
                { arabic: "رِبْحٌ", audio: "p22_word17.mp3" },
                { arabic: "خُسْرَانٌ", audio: "p22_word18.mp3" },
                { arabic: "مَكْسَبٌ", audio: "p22_word19.mp3" },
                { arabic: "خَيْبَةٌ", audio: "p22_word20.mp3" },
                // P23 series
                { arabic: "إِنْجَازٌ", audio: "p23_word1.mp3" },
                { arabic: "تَقْصِيرٌ", audio: "p23_word2.mp3" },
                { arabic: "تَقَدُّمٌ", audio: "p23_word3.mp3" },
                { arabic: "تَأَخُّرٌ", audio: "p23_word4.mp3" },
                { arabic: "تَطَوُّرٌ", audio: "p23_word5.mp3" },
                { arabic: "تَرَاجُعٌ", audio: "p23_word6.mp3" },
                { arabic: "نُمُوٌّ", audio: "p23_word7.mp3" },
                { arabic: "انْحِدَارٌ", audio: "p23_word8.mp3" },
                { arabic: "ازْدِهَارٌ", audio: "p23_word9.mp3" },
                { arabic: "انْهِيَارٌ", audio: "p23_word10.mp3" },
                { arabic: "بِنَاءٌ", audio: "p23_word11.mp3" },
                { arabic: "هَدْمٌ", audio: "p23_word12.mp3" },
                { arabic: "إِصْلَاحٌ", audio: "p23_word13.mp3" },
                { arabic: "إِفْسَادٌ", audio: "p23_word14.mp3" },
                { arabic: "تَحْسِينٌ", audio: "p23_word15.mp3" },
                { arabic: "تَخْرِيبٌ", audio: "p23_word16.mp3" },
                { arabic: "تَنْظِيمٌ", audio: "p23_word17.mp3" },
                { arabic: "فَوْضَى", audio: "p23_word18.mp3" },
                { arabic: "تَرْتِيبٌ", audio: "p23_word19.mp3" },
                { arabic: "بَعْثَرَةٌ", audio: "p23_word20.mp3" },
                // Additional p8 and p9 series files
                { arabic: "أَحْمَرُ", audio: "p8_word19.mp3" },
                { arabic: "أَزْرَقُ", audio: "p8_word20.mp3" },
                { arabic: "أَخْضَرُ", audio: "p8_word21.mp3" },
                { arabic: "أَصْفَرُ", audio: "p8_word22.mp3" },
                { arabic: "أَبْيَضُ", audio: "p8_word23.mp3" },
                { arabic: "أَسْوَدُ", audio: "p8_word24.mp3" },
                { arabic: "بُنِّيٌّ", audio: "p9_word1.mp3" },
                { arabic: "رَمَادِيٌّ", audio: "p9_word2.mp3" },
                { arabic: "بَنَفْسَجِيٌّ", audio: "p9_word3.mp3" },
                { arabic: "وَرْدِيٌّ", audio: "p9_word4.mp3" },
                { arabic: "بُرْتُقَالِيٌّ", audio: "p9_word5.mp3" },
                { arabic: "ذَهَبِيٌّ", audio: "p9_word6.mp3" },
                { arabic: "فِضِّيٌّ", audio: "p9_word7.mp3" },
                { arabic: "شَفَّافٌ", audio: "p9_word8.mp3" },
                { arabic: "مُعْتِمٌ", audio: "p9_word9.mp3" },
                { arabic: "لَامِعٌ", audio: "p9_word10.mp3" }
            ]
        },
        mainAudio: "p17_title.mp3"
    }
];

// Comprehensive Audio file mappings for different lesson types
const audioMappings = {
    letters: {
        baseAudio: "basmla.mp3",
        // All l1 series files
        allLetters: [
            "l1alf.mp3", "l1baa.mp3", "l1taa.mp3", "l1sthaa.mp3", "l1geem.mp3",
            "l1haa.mp3", "l1kaaf.mp3", "l1daal.mp3", "l1zaal.mp3", "l1raa.mp3",
            "l1zaa.mp3", "l1seen.mp3", "l1sheen.mp3", "l1saad.mp3", "l1daad.mp3",
            "l1ttaa.mp3", "l1zzaa.mp3", "l13aeen.mp3", "l1ghaeen.mp3", "l1faa.mp3",
            "l1qaaf.mp3", "l1laam.mp3", "l1meem.mp3", "l1noon.mp3", "l15aa.mp3",
            "l1waw.mp3", "l1yaa.mp3", "l1hamza.mp3", "l17aa.mp3", "l1yaa2.mp3"
        ]
    },
    harakat: {
        baseAudio: "basmla.mp3",
        // All p6, p7, p10 harakat files
        allHarakat: [
            "p6_b1.mp3", "p6_b2.mp3", "p6_b3.mp3", "p6_t1.mp3", "p6_t2.mp3", "p6_t3.mp3",
            "p6_tha1.mp3", "p6_tha2.mp3", "p6_tha3.mp3", "p6_g1.mp3", "p6_g2.mp3", "p6_g3.mp3",
            "p6_d1.mp3", "p6_d2.mp3", "p6_d3.mp3", "p6_r1.mp3", "p6_r2.mp3", "p6_r3.mp3",
            "p6_za1.mp3", "p6_za2.mp3", "p6_za3.mp3", "p6_s1.mp3", "p6_s2.mp3", "p6_s3.mp3",
            "p6_sh1.mp3", "p6_sh2.mp3", "p6_sh3.mp3", "p6_ss1.mp3", "p6_ss2.mp3", "p6_ss3.mp3",
            "p6_dd1.mp3", "p6_dd2.mp3", "p6_dd3.mp3", "p6_tt1.mp3", "p6_tt2.mp3", "p6_tt3.mp3",
            "p6_zza1.mp3", "p6_zza2.mp3", "p6_zza3.mp3", "p6_f1.mp3", "p6_f2.mp3", "p6_f3.mp3",
            "p6_q1.mp3", "p6_k1.mp3", "p6_k2.mp3", "p6_k3.mp3", "p6_l1.mp3", "p6_l2.mp3", "p6_l3.mp3",
            "p6_m1.mp3", "p6_m2.mp3", "p6_m3.mp3", "p6_n1.mp3", "p6_n2.mp3", "p6_n3.mp3",
            "p6_w1.mp3", "p6_w2.mp3", "p6_w3.mp3", "p6_y1.mp3", "p6_y2.mp3", "p6_y3.mp3",
            "p7_31.mp3", "p7_32.mp3", "p7_33.mp3", "p7_51.mp3", "p7_52.mp3", "p7_53.mp3",
            "p7_71.mp3", "p7_72.mp3", "p7_73.mp3", "p7_a1.mp3", "p7_a2.mp3", "p7_a3.mp3",
            "p7_gh1.mp3", "p7_gh2.mp3", "p7_gh3.mp3", "p7_h1.mp3", "p7_h2.mp3", "p7_h3.mp3",
            "p7_q2.mp3", "p7_q3.mp3", "p10_bae.mp3", "p10_bao.mp3", "p10_tae.mp3", "p10_tao.mp3",
            "p10_thae.mp3", "p10_thao.mp3", "p10_gae.mp3", "p10_gao.mp3", "p10_dae.mp3", "p10_dao.mp3",
            "p10_rae.mp3", "p10_rao.mp3", "p10_zae.mp3", "p10_zao.mp3", "p10_sae.mp3", "p10_sao.mp3",
            "p10_shae.mp3", "p10_shao.mp3", "p10_ssae.mp3", "p10_ssao.mp3", "p10_ddae.mp3", "p10_ddao.mp3",
            "p10_ttae.mp3", "p10_ttao.mp3", "p10_zzae.mp3", "p10_zzao.mp3", "p10_3ae.mp3", "p10_3ao.mp3",
            "p10_ghae.mp3", "p10_ghao.mp3", "p10_fae.mp3", "p10_fao.mp3", "p10_qae.mp3", "p10_qao.mp3",
            "p10_kae.mp3", "p10_kao.mp3", "p10_lae.mp3", "p10_lao.mp3", "p10_ma.mp3", "p10_mao.mp3",
            "p10_nae.mp3", "p10_nao.mp3", "p10_wa.mp3", "p10_wo.mp3", "p11_hae.mp3", "p11_hao.mp3",
            "p11_yae.mp3", "p11_yao.mp3"
        ]
    },
    words: {
        baseAudio: "basmla.mp3",
        // All word files from p11-p23 series
        allWords: [
            // P11 series (42 files)
            "p11_word1.mp3", "p11_word2.mp3", "p11_word3.mp3", "p11_word4.mp3", "p11_word5.mp3",
            "p11_word6.mp3", "p11_word7.mp3", "p11_word8.mp3", "p11_word9.mp3", "p11_word10.mp3",
            "p11_word11.mp3", "p11_word12.mp3", "p11_word13.mp3", "p11_word14.mp3", "p11_word15.mp3",
            "p11_word16.mp3", "p11_word17.mp3", "p11_word18.mp3", "p11_word19.mp3", "p11_word20.mp3",
            "p11_word21.mp3", "p11_word22.mp3", "p11_word23.mp3", "p11_word24.mp3", "p11_word25.mp3",
            "p11_word26.mp3", "p11_word27.mp3", "p11_word28.mp3", "p11_word29.mp3", "p11_word30.mp3",
            "p11_word31.mp3", "p11_word32.mp3", "p11_word33.mp3", "p11_word34.mp3", "p11_word35.mp3",
            "p11_word36.mp3", "p11_word37.mp3", "p11_word38.mp3", "p11_word39.mp3", "p11_word40.mp3",
            "p11_word41.mp3", "p11_word42.mp3",
            // P12 series (57 files)
            "p12_word1.mp3", "p12_word2.mp3", "p12_word3.mp3", "p12_word4.mp3", "p12_word5.mp3",
            "p12_word6.mp3", "p12_word7.mp3", "p12_word8.mp3", "p12_word9.mp3", "p12_word10.mp3",
            "p12_word11.mp3", "p12_word12.mp3", "p12_word13.mp3", "p12_word14.mp3", "p12_word15.mp3",
            "p12_word16.mp3", "p12_word17.mp3", "p12_word18.mp3", "p12_word19.mp3", "p12_word20.mp3",
            "p12_word21.mp3", "p12_word22.mp3", "p12_word23.mp3", "p12_word24.mp3", "p12_word25.mp3",
            "p12_word26.mp3", "p12_word27.mp3", "p12_word28.mp3", "p12_word29.mp3", "p12_word30.mp3",
            "p12_word31.mp3", "p12_word32.mp3", "p12_word33.mp3", "p12_word34.mp3", "p12_word35.mp3",
            "p12_word36.mp3", "p12_word37.mp3", "p12_word38.mp3", "p12_word39.mp3", "p12_word40.mp3",
            "p12_word41.mp3", "p12_word42.mp3", "p12_word43.mp3", "p12_word44.mp3", "p12_word45.mp3",
            "p12_word46.mp3", "p12_word47.mp3", "p12_word48.mp3", "p12_word49.mp3", "p12_word50.mp3",
            "p12_word51.mp3", "p12_word52.mp3", "p12_word53.mp3", "p12_word54.mp3", "p12_word55.mp3",
            "p12_word56.mp3", "p12_word57.mp3"
        ]
    },
    sentences: {
        baseAudio: "basmla.mp3"
    },
    review: {
        baseAudio: "basmla.mp3"
    },
    titles: {
        // All lesson title files
        allTitles: [
            "p2_title.mp3", "p3_title.mp3", "p4_title.mp3", "p5_title.mp3", "p6_title.mp3",
            "p7_title.mp3", "p8_title.mp3", "p9_title.mp3", "p10_title.mp3", "p11_title.mp3",
            "p12_title.mp3", "p13_title.mp3", "p14_title.mp3", "p15_title.mp3", "p16_title.mp3",
            "p17_title.mp3", "p18_title.mp3", "p19_title.mp3", "p20_title.mp3", "p21_title.mp3",
            "p22_title.mp3", "p23_title.mp3"
        ]
    }
};

// Export lessons data
if (typeof module !== 'undefined' && module.exports) {
    module.exports = { lessons, audioMappings };
}
