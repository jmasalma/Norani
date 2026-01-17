package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbah {
    private final int zza;
    private final zzbae zzb = new zzbaj();

    public zzbah(int i) {
        this.zza = i;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(((String) arrayList.get(i)).toLowerCase(Locale.US));
            sb.append(10);
        }
        String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        zzbag zzbag = new zzbag();
        int i2 = this.zza;
        PriorityQueue priorityQueue = new PriorityQueue(i2, new zzbaf(this));
        for (String zzb2 : split) {
            String[] zzb3 = zzbai.zzb(zzb2, false);
            if (zzb3.length != 0) {
                zzbam.zzc(zzb3, i2, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzbag.zzb.write(this.zzb.zzb(((zzbal) it.next()).zzb));
            } catch (IOException e) {
                int i3 = zze.zza;
                zzo.zzh("Error while writing hash to byteStream", e);
            }
        }
        return zzbag.toString();
    }
}
