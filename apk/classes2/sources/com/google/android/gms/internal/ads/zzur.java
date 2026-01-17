package com.google.android.gms.internal.ads;

import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzur implements zzxb {
    private final zzfyq zza;
    private long zzb;

    public zzur(List list, List list2) {
        int i = zzfyq.zzd;
        zzfyn zzfyn = new zzfyn();
        zzdd.zzd(list.size() == list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzfyn.zzf(new zzuq((zzxb) list.get(i2), (List) list2.get(i2)));
        }
        this.zza = zzfyn.zzi();
        this.zzb = -9223372036854775807L;
    }

    public final long zzb() {
        int i = 0;
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        while (true) {
            zzfyq zzfyq = this.zza;
            if (i >= zzfyq.size()) {
                break;
            }
            zzuq zzuq = (zzuq) zzfyq.get(i);
            long zzb2 = zzuq.zzb();
            if ((zzuq.zza().contains(1) || zzuq.zza().contains(2) || zzuq.zza().contains(4)) && zzb2 != Long.MIN_VALUE) {
                j = Math.min(j, zzb2);
            }
            if (zzb2 != Long.MIN_VALUE) {
                j2 = Math.min(j2, zzb2);
            }
            i++;
        }
        if (j != LongCompanionObject.MAX_VALUE) {
            this.zzb = j;
            return j;
        } else if (j2 == LongCompanionObject.MAX_VALUE) {
            return Long.MIN_VALUE;
        } else {
            long j3 = this.zzb;
            return j3 != -9223372036854775807L ? j3 : j2;
        }
    }

    public final long zzc() {
        int i = 0;
        long j = Long.MAX_VALUE;
        while (true) {
            zzfyq zzfyq = this.zza;
            if (i >= zzfyq.size()) {
                break;
            }
            long zzc = ((zzuq) zzfyq.get(i)).zzc();
            if (zzc != Long.MIN_VALUE) {
                j = Math.min(j, zzc);
            }
            i++;
        }
        if (j == LongCompanionObject.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final void zzm(long j) {
        int i = 0;
        while (true) {
            zzfyq zzfyq = this.zza;
            if (i < zzfyq.size()) {
                ((zzuq) zzfyq.get(i)).zzm(j);
                i++;
            } else {
                return;
            }
        }
    }

    public final boolean zzo(zzla zzla) {
        boolean z;
        boolean z2 = false;
        do {
            long zzc = zzc();
            if (zzc == Long.MIN_VALUE) {
                break;
            }
            int i = 0;
            z = false;
            while (true) {
                zzfyq zzfyq = this.zza;
                if (i >= zzfyq.size()) {
                    break;
                }
                long zzc2 = ((zzuq) zzfyq.get(i)).zzc();
                boolean z3 = zzc2 != Long.MIN_VALUE && zzc2 <= zzla.zza;
                if (zzc2 == zzc || z3) {
                    z |= ((zzuq) zzfyq.get(i)).zzo(zzla);
                }
                i++;
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    public final boolean zzp() {
        int i = 0;
        while (true) {
            zzfyq zzfyq = this.zza;
            if (i >= zzfyq.size()) {
                return false;
            }
            if (((zzuq) zzfyq.get(i)).zzp()) {
                return true;
            }
            i++;
        }
    }
}
