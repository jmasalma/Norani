package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzafh {
    public static int zza(int i) {
        int i2 = 0;
        while (i > 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    public static zzav zzb(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String str2 = zzex.zza;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                zzea.zzf("VorbisUtil", "Failed to parse Vorbis comment: ".concat(String.valueOf(str)));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzagt.zzb(new zzen(Base64.decode(split[1], 0))));
                } catch (RuntimeException e) {
                    zzea.zzg("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new zzahq(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzav(arrayList);
    }

    public static zzafe zzc(zzen zzen, boolean z, boolean z2) throws zzaz {
        if (z) {
            zzd(3, zzen, false);
        }
        String zzB = zzen.zzB((int) zzen.zzs(), StandardCharsets.UTF_8);
        int length = zzB.length();
        long zzs = zzen.zzs();
        String[] strArr = new String[((int) zzs)];
        int i = length + 15;
        for (int i2 = 0; ((long) i2) < zzs; i2++) {
            String zzB2 = zzen.zzB((int) zzen.zzs(), StandardCharsets.UTF_8);
            strArr[i2] = zzB2;
            i = i + 4 + zzB2.length();
        }
        if (!z2 || (zzen.zzm() & 1) != 0) {
            return new zzafe(zzB, strArr, i + 1);
        }
        throw zzaz.zza("framing bit expected to be set", (Throwable) null);
    }

    public static boolean zzd(int i, zzen zzen, boolean z) throws zzaz {
        if (zzen.zza() < 7) {
            if (z) {
                return false;
            }
            int zza = zzen.zza();
            throw zzaz.zza("too short header: " + zza, (Throwable) null);
        } else if (zzen.zzm() != i) {
            if (z) {
                return false;
            }
            throw zzaz.zza("expected header type ".concat(String.valueOf(Integer.toHexString(i))), (Throwable) null);
        } else if (zzen.zzm() == 118 && zzen.zzm() == 111 && zzen.zzm() == 114 && zzen.zzm() == 98 && zzen.zzm() == 105 && zzen.zzm() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw zzaz.zza("expected characters 'vorbis'", (Throwable) null);
        }
    }
}
