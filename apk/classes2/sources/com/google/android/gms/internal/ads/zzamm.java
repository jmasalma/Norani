package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzamm implements zzakt {
    private final zzen zza = new zzen();
    private final zzamc zzb = new zzamc();

    public final void zza(byte[] bArr, int i, int i2, zzaks zzaks, zzdn zzdn) {
        zzen zzen = this.zza;
        zzen.zzJ(bArr, i2 + i);
        zzen.zzL(i);
        ArrayList arrayList = new ArrayList();
        try {
            int zzc = zzen.zzc();
            String zzz = zzen.zzz(StandardCharsets.UTF_8);
            if (zzz == null || !zzz.startsWith("WEBVTT")) {
                zzen.zzL(zzc);
                throw zzaz.zza("Expected WEBVTT. Got ".concat(String.valueOf(zzen.zzz(StandardCharsets.UTF_8))), (Throwable) null);
            }
            do {
            } while (!TextUtils.isEmpty(zzen.zzz(StandardCharsets.UTF_8)));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                char c = 65535;
                int i3 = 0;
                while (c == 65535) {
                    i3 = zzen.zzc();
                    String zzz2 = zzen.zzz(StandardCharsets.UTF_8);
                    if (zzz2 == null) {
                        c = 0;
                    } else if ("STYLE".equals(zzz2)) {
                        c = 2;
                    } else {
                        c = zzz2.startsWith("NOTE") ? (char) 1 : 3;
                    }
                }
                zzen.zzL(i3);
                if (c == 0) {
                    zzakn.zza(new zzamp(arrayList2), zzaks, zzdn);
                    return;
                } else if (c == 1) {
                    do {
                    } while (!TextUtils.isEmpty(zzen.zzz(StandardCharsets.UTF_8)));
                } else if (c != 2) {
                    zzame zzc2 = zzaml.zzc(zzen, arrayList);
                    if (zzc2 != null) {
                        arrayList2.add(zzc2);
                    }
                } else if (arrayList2.isEmpty()) {
                    zzen.zzz(StandardCharsets.UTF_8);
                    arrayList.addAll(this.zzb.zzb(zzen));
                } else {
                    throw new IllegalArgumentException("A style block was found after the first cue.");
                }
            }
        } catch (zzaz e) {
            throw new IllegalArgumentException(e);
        }
    }
}
