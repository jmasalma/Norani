package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzxf {
    private int zza;
    private final SparseArray zzb;
    private final zzdn zzc;

    public zzxf() {
        this(new zzxe());
    }

    public final Object zzb() {
        SparseArray sparseArray = this.zzb;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public final void zzc(int i, Object obj) {
        boolean z = true;
        if (this.zza == -1) {
            zzdd.zzf(this.zzb.size() == 0);
            this.zza = 0;
        }
        SparseArray sparseArray = this.zzb;
        if (sparseArray.size() > 0) {
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            if (i < keyAt) {
                z = false;
            }
            zzdd.zzd(z);
            if (keyAt == i) {
                this.zzc.zza(sparseArray.valueAt(sparseArray.size() - 1));
            }
        }
        sparseArray.append(i, obj);
    }

    public final void zzd() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.zzb;
            if (i < sparseArray.size()) {
                this.zzc.zza(sparseArray.valueAt(i));
                i++;
            } else {
                this.zza = -1;
                sparseArray.clear();
                return;
            }
        }
    }

    public final void zze(int i) {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.zzb;
            if (i2 < sparseArray.size() - 1) {
                int i3 = i2 + 1;
                if (i >= sparseArray.keyAt(i3)) {
                    this.zzc.zza(sparseArray.valueAt(i2));
                    sparseArray.removeAt(i2);
                    int i4 = this.zza;
                    if (i4 > 0) {
                        this.zza = i4 - 1;
                    }
                    i2 = i3;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final boolean zzf() {
        return this.zzb.size() == 0;
    }

    public zzxf(zzdn zzdn) {
        this.zzb = new SparseArray();
        this.zzc = zzdn;
        this.zza = -1;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x001a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    public final java.lang.Object zza(int r5) {
        /*
            r4 = this;
            int r0 = r4.zza
            r1 = -1
            if (r0 == r1) goto L_0x0006
            goto L_0x0009
        L_0x0006:
            r0 = 0
        L_0x0007:
            r4.zza = r0
        L_0x0009:
            int r0 = r4.zza
            if (r0 > 0) goto L_0x000e
            goto L_0x001a
        L_0x000e:
            android.util.SparseArray r2 = r4.zzb
            int r0 = r2.keyAt(r0)
            if (r5 >= r0) goto L_0x001a
            int r0 = r4.zza
            int r0 = r0 + r1
            goto L_0x0007
        L_0x001a:
            int r0 = r4.zza
            android.util.SparseArray r2 = r4.zzb
            int r3 = r2.size()
            int r3 = r3 + r1
            if (r0 >= r3) goto L_0x0036
            int r0 = r4.zza
            int r0 = r0 + 1
            int r0 = r2.keyAt(r0)
            if (r5 < r0) goto L_0x0036
            int r0 = r4.zza
            int r0 = r0 + 1
            r4.zza = r0
            goto L_0x001a
        L_0x0036:
            int r5 = r4.zza
            java.lang.Object r5 = r2.valueAt(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxf.zza(int):java.lang.Object");
    }
}
