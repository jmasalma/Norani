package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfc extends zzff {
    public final long zza;
    public final List zzb = new ArrayList();
    public final List zzc = new ArrayList();

    public zzfc(int i, long j) {
        super(i, (zzfe) null);
        this.zza = j;
    }

    public final String toString() {
        List list = this.zzb;
        String zze = zze(this.zzd);
        String arrays = Arrays.toString(list.toArray());
        String arrays2 = Arrays.toString(this.zzc.toArray());
        return zze + " leaves: " + arrays + " containers: " + arrays2;
    }

    public final zzfc zza(int i) {
        List list = this.zzc;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzfc zzfc = (zzfc) list.get(i2);
            if (zzfc.zzd == i) {
                return zzfc;
            }
        }
        return null;
    }

    public final zzfd zzb(int i) {
        List list = this.zzb;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzfd zzfd = (zzfd) list.get(i2);
            if (zzfd.zzd == i) {
                return zzfd;
            }
        }
        return null;
    }

    public final void zzc(zzfc zzfc) {
        this.zzc.add(zzfc);
    }

    public final void zzd(zzfd zzfd) {
        this.zzb.add(zzfd);
    }
}
