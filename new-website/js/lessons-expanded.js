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
        title: "الدرس الخامس: الحركات الأساسية - الفتحة",
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
                { arabic: "هَ", name: "هاء بالفتحة", audio: "p10_hae.mp3" },
                { arabic: "وَ", name: "واو بالفتحة", audio: "p10_wa.mp3" },
                { arabic: "يَ", name: "ياء بالفتحة", audio: "p11_yae.mp3" }
            ]
        },
        mainAudio: "p5_title.mp3"
    },
    {
        id: 6,
        title: "الدرس السادس: الحركات الأساسية - الضمة",
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
        title: "الدرس السابع: الحركات الأساسية - الكسرة",
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
        title: "الدرس الثامن: الحركات المتقدمة - التنوين",
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
        title: "الدرس التاسع: الكلمات البسيطة - مجموعة الباء",
        description: "كلمات تبدأ بحرف الباء مع الحركات",
        type: "words",
        content: {
            words: [
                { arabic: "بَابٌ", audio: "p11_word1.mp3" },
                { arabic: "بَاتٌ", audio: "p11_word2.mp3" },
                { arabic: "بَاجٌ", audio: "p11_word3.mp3" },
                { arabic: "بَادٌ", audio: "p11_word4.mp3" },
                { arabic: "بَارٌ", audio: "p11_word5.mp3" },
                { arabic: "بَاسٌ", audio: "p11_word6.mp3" },
                { arabic: "بَاشٌ", audio: "p11_word7.mp3" },
                { arabic: "بَاصٌ", audio: "p11_word8.mp3" },
                { arabic: "بَاضٌ", audio: "p11_word9.mp3" },
                { arabic: "بَاطٌ", audio: "p11_word10.mp3" },
                { arabic: "بَاظٌ", audio: "p11_word11.mp3" },
                { arabic: "بَاعٌ", audio: "p11_word12.mp3" },
                { arabic: "بَاغٌ", audio: "p11_word13.mp3" },
                { arabic: "بَافٌ", audio: "p11_word14.mp3" },
                { arabic: "بَاقٌ", audio: "p11_word15.mp3" },
                { arabic: "بَاكٌ", audio: "p11_word16.mp3" },
                { arabic: "بَالٌ", audio: "p11_word17.mp3" },
                { arabic: "بَامٌ", audio: "p11_word18.mp3" }
            ]
        },
        mainAudio: "p9_title.mp3"
    },
    {
        id: 10,
        title: "الدرس العاشر: الكلمات البسيطة - مجموعة التاء",
        description: "كلمات تبدأ بحرف التاء مع الحركات",
        type: "words",
        content: {
            words: [
                { arabic: "تَابٌ", audio: "p11_word19.mp3" },
                { arabic: "تَاتٌ", audio: "p11_word20.mp3" },
                { arabic: "تَاجٌ", audio: "p11_word21.mp3" },
                { arabic: "تَادٌ", audio: "p11_word22.mp3" },
                { arabic: "تَارٌ", audio: "p11_word23.mp3" },
                { arabic: "تَاسٌ", audio: "p11_word24.mp3" },
                { arabic: "تَاشٌ", audio: "p11_word25.mp3" },
                { arabic: "تَاصٌ", audio: "p11_word26.mp3" },
                { arabic: "تَاضٌ", audio: "p11_word27.mp3" },
                { arabic: "تَاطٌ", audio: "p11_word28.mp3" },
                { arabic: "تَاظٌ", audio: "p11_word29.mp3" },
                { arabic: "تَاعٌ", audio: "p11_word30.mp3" },
                { arabic: "تَاغٌ", audio: "p11_word31.mp3" },
                { arabic: "تَافٌ", audio: "p11_word32.mp3" },
                { arabic: "تَاقٌ", audio: "p11_word33.mp3" },
                { arabic: "تَاكٌ", audio: "p11_word34.mp3" },
                { arabic: "تَالٌ", audio: "p11_word35.mp3" },
                { arabic: "تَامٌ", audio: "p11_word36.mp3" }
            ]
        },
        mainAudio: "p10_title.mp3"
    },
    {
        id: 11,
        title: "الدرس الحادي عشر: الكلمات البسيطة - مجموعة الجيم",
        description: "كلمات تبدأ بحرف الجيم مع الحركات",
        type: "words",
        content: {
            words: [
                { arabic: "جَابٌ", audio: "p11_word37.mp3" },
                { arabic: "جَاتٌ", audio: "p11_word38.mp3" },
                { arabic: "جَاجٌ", audio: "p11_word39.mp3" },
                { arabic: "جَادٌ", audio: "p11_word40.mp3" },
                { arabic: "جَارٌ", audio: "p11_word41.mp3" },
                { arabic: "جَاسٌ", audio: "p11_word42.mp3" },
                { arabic: "جَاشٌ", audio: "p12_word1.mp3" },
                { arabic: "جَاصٌ", audio: "p12_word2.mp3" },
                { arabic: "جَاضٌ", audio: "p12_word3.mp3" },
                { arabic: "جَاطٌ", audio: "p12_word4.mp3" },
                { arabic: "جَاظٌ", audio: "p12_word5.mp3" },
                { arabic: "جَاعٌ", audio: "p12_word6.mp3" },
                { arabic: "جَاغٌ", audio: "p12_word7.mp3" },
                { arabic: "جَافٌ", audio: "p12_word8.mp3" },
                { arabic: "جَاقٌ", audio: "p12_word9.mp3" },
                { arabic: "جَاكٌ", audio: "p12_word10.mp3" },
                { arabic: "جَالٌ", audio: "p12_word11.mp3" },
                { arabic: "جَامٌ", audio: "p12_word12.mp3" }
            ]
        },
        mainAudio: "p11_title.mp3"
    },
    {
        id: 12,
        title: "الدرس الثاني عشر: الكلمات المتقدمة - مجموعة الدال",
        description: "كلمات تبدأ بحرف الدال مع الحركات",
        type: "words",
        content: {
            words: [
                { arabic: "دَابٌ", audio: "p12_word13.mp3" },
                { arabic: "دَاتٌ", audio: "p12_word14.mp3" },
                { arabic: "دَاجٌ", audio: "p12_word15.mp3" },
                { arabic: "دَادٌ", audio: "p12_word16.mp3" },
                { arabic: "دَارٌ", audio: "p12_word17.mp3" },
                { arabic: "دَاسٌ", audio: "p12_word18.mp3" },
                { arabic: "دَاشٌ", audio: "p12_word19.mp3" },
                { arabic: "دَاصٌ", audio: "p12_word20.mp3" },
                { arabic: "دَاضٌ", audio: "p12_word21.mp3" },
                { arabic: "دَاطٌ", audio: "p12_word22.mp3" },
                { arabic: "دَاظٌ", audio: "p12_word23.mp3" },
                { arabic: "دَاعٌ", audio: "p12_word24.mp3" },
                { arabic: "دَاغٌ", audio: "p12_word25.mp3" },
                { arabic: "دَافٌ", audio: "p12_word26.mp3" },
                { arabic: "دَاقٌ", audio: "p12_word27.mp3" },
                { arabic: "دَاكٌ", audio: "p12_word28.mp3" },
                { arabic: "دَالٌ", audio: "p12_word29.mp3" },
                { arabic: "دَامٌ", audio: "p12_word30.mp3" }
            ]
        },
        mainAudio: "p12_title.mp3"
    },
    {
        id: 13,
        title: "الدرس الثالث عشر: الكلمات المتقدمة - مجموعة الراء",
        description: "كلمات تبدأ بحرف الراء مع الحركات",
        type: "words",
        content: {
            words: [
                { arabic: "رَابٌ", audio: "p12_word31.mp3" },
                { arabic: "رَاتٌ", audio: "p12_word32.mp3" },
                { arabic: "رَاجٌ", audio: "p12_word33.mp3" },
                { arabic: "رَادٌ", audio: "p12_word34.mp3" },
                { arabic: "رَارٌ", audio: "p12_word35.mp3" },
                { arabic: "رَاسٌ", audio: "p12_word36.mp3" },
                { arabic: "رَاشٌ", audio: "p12_word37.mp3" },
                { arabic: "رَاصٌ", audio: "p12_word38.mp3" },
                { arabic: "رَاضٌ", audio: "p12_word39.mp3" },
                { arabic: "رَاطٌ", audio: "p12_word40.mp3" },
                { arabic: "رَاظٌ", audio: "p12_word41.mp3" },
                { arabic: "رَاعٌ", audio: "p12_word42.mp3" },
                { arabic: "رَاغٌ", audio: "p12_word43.mp3" },
                { arabic: "رَافٌ", audio: "p12_word44.mp3" },
                { arabic: "رَاقٌ", audio: "p12_word45.mp3" },
                { arabic: "رَاكٌ", audio: "p12_word46.mp3" },
                { arabic: "رَالٌ", audio: "p12_word47.
