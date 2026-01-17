#!/bin/bash

# Fix Arabic Letter Order in Lesson 1 to Match Traditional Norani Qaida PDF Sequence
# Proper Arabic alphabet order: ا ب ت ث ج ح خ د ذ ر ز س ش ص ض ط ظ ع غ ف ق ك ل م ن ه و ي

cd "$(dirname "$0")"

echo "=== FIXING LESSON 1 LETTER ORDER TO MATCH NORANI QAIDA PDF ==="

# Create the corrected Lesson 1 with proper Arabic alphabet sequence
cat > docs/js/flashcards_correct_order.js << 'EOF'
// Complete 17-Lesson Norani Qaida Flashcards - ALL 1,094 Files
// FIXED: Lesson 1 letters now in proper Arabic alphabet order
const flashcardsData = {
    1: {
        title: "Lesson 1: Individual Letters (الحروف المفردة)",
        description: "Learn the 28 Arabic letters with authentic pronunciation",
        cards: [
EOF

echo "=== PROCESSING LESSON 1: LETTERS IN CORRECT ARABIC ALPHABET ORDER ==="

# Define the correct Arabic alphabet order with corresponding filenames
declare -a correct_order=(
    "alif:ا:Alif:aa:straight vertical line - first letter of Arabic alphabet"
    "baa:ب:Baa:b:curved line with one dot below - second letter"
    "taa:ت:Taa:t:curved line with two dots above - third letter"
    "thaa:ث:Thaa:th:curved line with three dots above - fourth letter"
    "jeem:ج:Jeem:j:curved shape with one dot below - fifth letter"
    "haa:ح:Haa:h:curved opening with no dots - sixth letter"
    "khaa:خ:Khaa:kh:curved opening with one dot above - seventh letter"
    "daal:د:Daal:d:curved at top with no dots - eighth letter"
    "dhaal:ذ:Dhaal:dh:curved at top with one dot above - ninth letter"
    "raa:ر:Raa:r:curved hook shape - tenth letter"
    "zaay:ز:Zaay:z:curved hook with one dot above - eleventh letter"
    "seen:س:Seen:s:three connected teeth - twelfth letter"
    "sheen:ش:Sheen:sh:three teeth with three dots above - thirteenth letter"
    "saad:ص:Saad:s:curved emphatic letter - fourteenth letter"
    "daad:ض:Daad:d:curved with one dot above - fifteenth letter"
    "taa_emphatic:ط:Taa:t:emphatic curved form - sixteenth letter"
    "dhaa_emphatic:ظ:Dhaa:dh:emphatic with one dot above - seventeenth letter"
    "ayn:ع:Ayn:a:curved opening shape - eighteenth letter"
    "ghayn:غ:Ghayn:gh:curved opening with one dot above - nineteenth letter"
    "faa:ف:Faa:f:circle with one dot above - twentieth letter"
    "qaaf:ق:Qaaf:q:circle with two dots above - twenty-first letter"
    "kaaf:ك:Kaaf:k:angular shape with small tooth - twenty-second letter"
    "laam:ل:Laam:l:tall curved letter - twenty-third letter"
    "meem:م:Meem:m:circular closed shape - twenty-fourth letter"
    "noon:ن:Noon:n:curved with one dot above - twenty-fifth letter"
    "haa_soft:ه:Haa:h:oval shape with two dots - twenty-sixth letter"
    "waaw:و:Waaw:w:curved hook shape - twenty-seventh letter"
    "yaa:ي:Yaa:y:curved with two dots below - twenty-eighth letter"
)

# Process letters in correct Arabic alphabet order
for letter_info in "${correct_order[@]}"; do
    IFS=':' read -r filename arabic trans pron hint <<< "$letter_info"
    
    # Check if the audio file exists
    if [ -f "docs/audio/letters/$filename.mp3" ]; then
        cat >> docs/js/flashcards_correct_order.js << EOF
            {
                arabic: "$arabic",
                transliteration: "$trans",
                pronunciation: "$pron",
                explanation: "Arabic letter $trans - pronounced '$pron'",
                hint: "$hint",
                audio: "audio/letters/$filename.mp3"
            },
EOF
        echo "✓ Added: $arabic ($trans) - $filename.mp3"
    else
        echo "⚠ Missing audio file: $filename.mp3"
    fi
done

# Handle any additional letter files that might exist but weren't in our main list
echo "=== CHECKING FOR ADDITIONAL LETTER FILES ==="
for file in docs/audio/letters/*.mp3; do
    if [ -f "$file" ]; then
        filename=$(basename "$file" .mp3)
        
        # Check if this file was already processed
        found=false
        for letter_info in "${correct_order[@]}"; do
            IFS=':' read -r check_filename _ _ _ _ <<< "$letter_info"
            if [ "$filename" = "$check_filename" ]; then
                found=true
                break
            fi
        done
        
        # If not found in main list, add it at the end
        if [ "$found" = false ]; then
            echo "⚠ Additional file found: $filename.mp3 - adding to end"
            case "$filename" in
                yaa2) arabic="ى"; trans="Yaa"; pron="y"; hint="curved without dots - alternative yaa form" ;;
                dhaa_alt) arabic="ذ"; trans="Dhaal"; pron="dh"; hint="alternative dhaal form" ;;
                *) arabic="حرف"; trans="$filename"; pron="$filename"; hint="Additional letter: $filename" ;;
            esac
            
            cat >> docs/js/flashcards_correct_order.js << EOF
            {
                arabic: "$arabic",
                transliteration: "$trans",
                pronunciation: "$pron",
                explanation: "Arabic letter $trans - pronounced '$pron'",
                hint: "$hint",
                audio: "audio/letters/$filename.mp3"
            },
EOF
        fi
    fi
done

# Now copy the rest of the lessons from the current flashcards file
echo "=== COPYING REMAINING LESSONS 2-18 ==="

# Extract lessons 2-18 from current flashcards
sed -n '/},.*2:.*{/,$ p' docs/js/flashcards.js | sed '1d' >> docs/js/flashcards_correct_order.js

echo "=== LETTER ORDER CORRECTION COMPLETED ==="
echo "Generated flashcards_correct_order.js with proper Arabic alphabet sequence"
echo "Letters now in traditional order: ا ب ت ث ج ح خ د ذ ر ز س ش ص ض ط ظ ع غ ف ق ك ل م ن ه و ي"
