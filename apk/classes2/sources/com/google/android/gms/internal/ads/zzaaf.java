package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaaf {
    private static final Comparator zza = new zzaab();
    private static final Comparator zzb = new zzaac();
    private final ArrayList zzc = new ArrayList();
    private final zzaad[] zzd = new zzaad[5];
    private int zze = -1;
    private int zzf;
    private int zzg;
    private int zzh;

    public zzaaf(int i) {
    }

    public final float zza(float f) {
        int i = 0;
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f2 = (float) this.zzg;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.zzc;
            if (i < arrayList.size()) {
                zzaad zzaad = (zzaad) arrayList.get(i);
                i2 += zzaad.zzb;
                if (((float) i2) >= 0.5f * f2) {
                    return zzaad.zzc;
                }
                i++;
            } else if (arrayList.isEmpty()) {
                return Float.NaN;
            } else {
                return ((zzaad) arrayList.get(arrayList.size() - 1)).zzc;
            }
        }
    }

    public final void zzb(int i, float f) {
        zzaad zzaad;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i2 = this.zzh;
        if (i2 > 0) {
            zzaad[] zzaadArr = this.zzd;
            int i3 = i2 - 1;
            this.zzh = i3;
            zzaad = zzaadArr[i3];
        } else {
            zzaad = new zzaad((zzaae) null);
        }
        int i4 = this.zzf;
        this.zzf = i4 + 1;
        zzaad.zza = i4;
        zzaad.zzb = i;
        zzaad.zzc = f;
        ArrayList arrayList = this.zzc;
        arrayList.add(zzaad);
        this.zzg += i;
        while (true) {
            int i5 = this.zzg;
            if (i5 > 2000) {
                int i6 = i5 - 2000;
                zzaad zzaad2 = (zzaad) arrayList.get(0);
                int i7 = zzaad2.zzb;
                if (i7 <= i6) {
                    this.zzg -= i7;
                    arrayList.remove(0);
                    int i8 = this.zzh;
                    if (i8 < 5) {
                        zzaad[] zzaadArr2 = this.zzd;
                        this.zzh = i8 + 1;
                        zzaadArr2[i8] = zzaad2;
                    }
                } else {
                    zzaad2.zzb = i7 - i6;
                    this.zzg -= i6;
                }
            } else {
                return;
            }
        }
    }

    public final void zzc() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }
}
