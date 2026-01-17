package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzazt {
    int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    public final void zza(zzazs zzazs) {
        synchronized (this.zzb) {
            List list = this.zzc;
            if (list.size() >= 10) {
                String str = "Queue is full, current size = " + list.size();
                int i = zze.zza;
                zzo.zze(str);
                list.remove(0);
            }
            int i2 = this.zza;
            this.zza = i2 + 1;
            zzazs.zzg(i2);
            zzazs.zzk();
            list.add(zzazs);
        }
    }

    public final boolean zzb(zzazs zzazs) {
        synchronized (this.zzb) {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                zzazs zzazs2 = (zzazs) it.next();
                if (!zzv.zzp().zzi().zzK()) {
                    if (!zzazs.equals(zzazs2) && zzazs2.zzc().equals(zzazs.zzc())) {
                        it.remove();
                        return true;
                    }
                } else if (!zzv.zzp().zzi().zzL() && !zzazs.equals(zzazs2) && zzazs2.zzd().equals(zzazs.zzd())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean zzc(zzazs zzazs) {
        synchronized (this.zzb) {
            if (this.zzc.contains(zzazs)) {
                return true;
            }
            return false;
        }
    }
}
