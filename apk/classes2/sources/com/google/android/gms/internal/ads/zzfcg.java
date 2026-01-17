package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfcg {
    private zzfcg(long j, int[] iArr) {
    }

    static zzfyq zza(JsonReader jsonReader) throws IOException {
        int[] iArr;
        int i = zzfyq.zzd;
        zzfyn zzfyn = new zzfyn();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            zzfyq zzn = zzfyq.zzn();
            jsonReader.beginObject();
            zzfcg zzfcg = null;
            Long l = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (Objects.equals(nextName, "id")) {
                    l = Long.valueOf(jsonReader.nextLong());
                } else if (Objects.equals(nextName, "event_types")) {
                    zzfyn zzfyn2 = new zzfyn();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzfyn2.zzf(Integer.valueOf(jsonReader.nextInt()));
                    }
                    jsonReader.endArray();
                    zzn = zzfyn2.zzi();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            if (l != null && !zzn.isEmpty()) {
                long longValue = l.longValue();
                if (zzn == null) {
                    iArr = new int[0];
                } else {
                    int[] iArr2 = new int[zzn.size()];
                    for (int i2 = 0; i2 < zzn.size(); i2++) {
                        iArr2[i2] = ((Integer) zzn.get(i2)).intValue();
                    }
                    iArr = iArr2;
                }
                zzfcg = new zzfcg(longValue, iArr);
            }
            if (zzfcg != null) {
                zzfyn.zzf(zzfcg);
            }
        }
        jsonReader.endArray();
        return zzfyn.zzi();
    }
}
