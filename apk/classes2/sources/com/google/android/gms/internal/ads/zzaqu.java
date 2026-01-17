package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaqu {
    protected static final Comparator zza = new zzaqt();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList(64);
    private int zzd = 0;

    public zzaqu(int i) {
    }

    private final synchronized void zzc() {
        while (this.zzd > 4096) {
            byte[] bArr = (byte[]) this.zzb.remove(0);
            this.zzc.remove(bArr);
            this.zzd -= bArr.length;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zza(byte[] r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            if (r4 == 0) goto L_0x002b
            int r0 = r4.length     // Catch:{ all -> 0x0028 }
            r1 = 4096(0x1000, float:5.74E-42)
            if (r0 <= r1) goto L_0x0009
            goto L_0x002b
        L_0x0009:
            java.util.List r1 = r3.zzb     // Catch:{ all -> 0x0028 }
            r1.add(r4)     // Catch:{ all -> 0x0028 }
            java.util.List r1 = r3.zzc     // Catch:{ all -> 0x0028 }
            java.util.Comparator r2 = zza     // Catch:{ all -> 0x0028 }
            int r2 = java.util.Collections.binarySearch(r1, r4, r2)     // Catch:{ all -> 0x0028 }
            if (r2 >= 0) goto L_0x001b
            int r2 = -r2
            int r2 = r2 + -1
        L_0x001b:
            r1.add(r2, r4)     // Catch:{ all -> 0x0028 }
            int r4 = r3.zzd     // Catch:{ all -> 0x0028 }
            int r4 = r4 + r0
            r3.zzd = r4     // Catch:{ all -> 0x0028 }
            r3.zzc()     // Catch:{ all -> 0x0028 }
            monitor-exit(r3)
            return
        L_0x0028:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            throw r4
        L_0x002b:
            monitor-exit(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqu.zza(byte[]):void");
    }

    public final synchronized byte[] zzb(int i) {
        int i2 = 0;
        while (true) {
            List list = this.zzc;
            if (i2 < list.size()) {
                byte[] bArr = (byte[]) list.get(i2);
                int length = bArr.length;
                if (length >= i) {
                    this.zzd -= length;
                    list.remove(i2);
                    this.zzb.remove(bArr);
                    return bArr;
                }
                i2++;
            } else {
                return new byte[i];
            }
        }
    }
}
