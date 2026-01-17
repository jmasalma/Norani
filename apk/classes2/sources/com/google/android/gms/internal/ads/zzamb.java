package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzamb implements zzakt {
    private final zzen zza = new zzen();

    public final void zza(byte[] bArr, int i, int i2, zzaks zzaks, zzdn zzdn) {
        zzcu zzcu;
        zzen zzen = this.zza;
        zzen.zzJ(bArr, i2 + i);
        zzen.zzL(i);
        ArrayList arrayList = new ArrayList();
        while (zzen.zza() > 0) {
            zzdd.zze(zzen.zza() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int zzg = zzen.zzg() - 8;
            if (zzen.zzg() == 1987343459) {
                CharSequence charSequence = null;
                zzcs zzcs = null;
                while (zzg > 0) {
                    zzdd.zze(zzg >= 8, "Incomplete vtt cue box header found.");
                    int zzg2 = zzen.zzg();
                    int zzg3 = zzen.zzg();
                    int i3 = zzg - 8;
                    int i4 = zzg2 - 8;
                    String zzC = zzex.zzC(zzen.zzN(), zzen.zzc(), i4);
                    zzen.zzM(i4);
                    if (zzg3 == 1937011815) {
                        zzcs = zzaml.zzb(zzC);
                    } else if (zzg3 == 1885436268) {
                        charSequence = zzaml.zza((String) null, zzC.trim(), Collections.emptyList());
                    }
                    zzg = i3 - i4;
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (zzcs != null) {
                    zzcs.zzl(charSequence);
                    zzcu = zzcs.zzq();
                } else {
                    Pattern pattern = zzaml.zza;
                    zzamj zzamj = new zzamj();
                    zzamj.zzc = charSequence;
                    zzcu = zzamj.zza().zzq();
                }
                arrayList.add(zzcu);
            } else {
                zzen.zzM(zzg);
            }
        }
        zzdn.zza(new zzakl(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
