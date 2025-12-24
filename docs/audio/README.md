# Audio Files for Norani Qaida Flashcards

This directory should contain MP3 audio files for proper pronunciation of Arabic letters and words.

## Directory Structure

```
audio/
├── letters/
│   ├── alif.mp3
│   ├── baa.mp3
│   ├── taa.mp3
│   ├── thaa.mp3
│   ├── jeem.mp3
│   ├── haa.mp3
│   ├── khaa.mp3
│   ├── daal.mp3
│   ├── dhaal.mp3
│   ├── raa.mp3
│   ├── zaay.mp3
│   ├── seen.mp3
│   ├── sheen.mp3
│   ├── saad.mp3
│   ├── daad.mp3
│   ├── taa_emphatic.mp3
│   ├── dhaa_emphatic.mp3
│   ├── ayn.mp3
│   ├── ghayn.mp3
│   ├── faa.mp3
│   ├── qaaf.mp3
│   ├── kaaf.mp3
│   ├── laam.mp3
│   ├── meem.mp3
│   ├── noon.mp3
│   ├── haa_soft.mp3
│   ├── waaw.mp3
│   └── yaa.mp3
├── combinations/
│   ├── baa_alif.mp3
│   ├── taa_alif.mp3
│   └── ... (other combinations)
├── harakat/
│   ├── ba_fatha.mp3
│   ├── bi_kasra.mp3
│   ├── bu_damma.mp3
│   └── ... (other vowel combinations)
├── madd/
│   ├── baa_long.mp3
│   ├── boo_long.mp3
│   ├── bee_long.mp3
│   └── ... (other long vowels)
├── sukun_shaddah/
│   ├── b_sukun.mp3
│   ├── bba_shaddah.mp3
│   └── ... (other sukun/shaddah)
├── tanween/
│   ├── ban_tanween.mp3
│   ├── bin_tanween.mp3
│   ├── bun_tanween.mp3
│   └── ... (other tanween)
└── advanced/
    ├── al_definite.mp3
    ├── al_bayt.mp3
    ├── ash_shams.mp3
    ├── al_qamar.mp3
    ├── madrasa.mp3
    ├── kitaab.mp3
    ├── muallim.mp3
    ├── taalib.mp3
    ├── bismillah.mp3
    ├── alhamdulillah.mp3
    ├── assalaamu_alaykum.mp3
    └── wa_alaykumus_salaam.mp3
```

## Audio File Requirements

- **Format**: MP3 (recommended for web compatibility)
- **Quality**: 128 kbps or higher
- **Duration**: Keep recordings concise (1-3 seconds for letters, 2-5 seconds for words)
- **Voice**: Clear, native Arabic pronunciation
- **Volume**: Consistent levels across all files

## Fallback Behavior

If audio files are not available, the application will automatically use the browser's built-in Text-to-Speech (TTS) functionality as a fallback. The TTS is configured for Arabic pronunciation but may not be as accurate as native recordings.

## Adding Audio Files

1. Record or obtain high-quality Arabic pronunciation audio files
2. Convert them to MP3 format
3. Name them according to the structure above
4. Place them in the appropriate subdirectories
5. The application will automatically detect and use them

## Sources for Audio Files

- Record with a native Arabic speaker
- Use professional Arabic language learning resources
- Generate using high-quality Arabic TTS services
- Commission from Arabic voice actors

## Testing

After adding audio files, test the application to ensure:
- Files load correctly
- Audio plays without errors
- Volume levels are consistent
- Pronunciation is clear and accurate

The audio button (🔊) will appear on each flashcard and will play the corresponding audio file when clicked.
