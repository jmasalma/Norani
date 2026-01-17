package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbcj;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfek implements zzfej {
    private final ConcurrentHashMap zza;
    private final zzfeq zzb;
    private final zzfem zzc = new zzfem();

    public zzfek(zzfeq zzfeq) {
        this.zza = new ConcurrentHashMap(zzfeq.zzd);
        this.zzb = zzfeq;
    }

    private final void zzf() {
        Parcelable.Creator<zzfeq> creator = zzfeq.CREATOR;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzgB)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            zzfeq zzfeq = this.zzb;
            sb.append(zzfeq.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzb());
            int i = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzfet) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((zzfei) entry.getValue()).zzb(); i2++) {
                    sb.append("[O]");
                }
                for (int zzb2 = ((zzfei) entry.getValue()).zzb(); zzb2 < zzfeq.zzd; zzb2++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zzfei) entry.getValue()).zzg());
                sb.append("\n");
            }
            while (i < zzfeq.zzc) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            String sb2 = sb.toString();
            int i3 = zze.zza;
            zzo.zze(sb2);
        }
    }

    public final zzfeq zza() {
        return this.zzb;
    }

    public final synchronized zzfes zzb(zzfet zzfet) {
        zzfes zzfes;
        zzfei zzfei = (zzfei) this.zza.get(zzfet);
        if (zzfei != null) {
            zzfes = zzfei.zze();
            if (zzfes == null) {
                this.zzc.zze();
            }
            zzffg zzf = zzfei.zzf();
            if (zzfes != null) {
                zzbcj.zzb.zzc zzd = zzbcj.zzb.zzd();
                zzbcj.zzb.zza.C0003zza zza2 = zzbcj.zzb.zza.zza();
                zza2.zzf(zzbcj.zzb.zzd.IN_MEMORY);
                zzbcj.zzb.zze.zza zzb2 = zzbcj.zzb.zze.zzb();
                zzb2.zzd(zzf.zza);
                zzb2.zze(zzf.zzb);
                zza2.zzg(zzb2);
                zzd.zzd(zza2);
                zzfes.zza.zzb().zzc().zzi((zzbcj.zzb) zzd.zzbr());
            }
            zzf();
        } else {
            this.zzc.zzf();
            zzf();
            zzfes = null;
        }
        return zzfes;
    }

    @Deprecated
    public final zzfet zzc(zzm zzm, String str, zzx zzx) {
        zzfeq zzfeq = this.zzb;
        return new zzfeu(zzm, str, new zzbvt(zzfeq.zza).zza().zzj, zzfeq.zzf, zzx);
    }

    public final synchronized boolean zzd(zzfet zzfet, zzfes zzfes) {
        boolean zzh;
        ConcurrentHashMap concurrentHashMap = this.zza;
        zzfei zzfei = (zzfei) concurrentHashMap.get(zzfet);
        zzfes.zzd = zzv.zzD().currentTimeMillis();
        if (zzfei == null) {
            zzfeq zzfeq = this.zzb;
            zzfei zzfei2 = new zzfei(zzfeq.zzd, zzfeq.zze * zzbcj.zzq.zzf);
            if (concurrentHashMap.size() == zzfeq.zzc) {
                int i = zzfeq.zzg;
                int i2 = i - 1;
                zzfet zzfet2 = null;
                if (i != 0) {
                    long j = LongCompanionObject.MAX_VALUE;
                    if (i2 == 0) {
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            if (((zzfei) entry.getValue()).zzc() < j) {
                                j = ((zzfei) entry.getValue()).zzc();
                                zzfet2 = (zzfet) entry.getKey();
                            }
                        }
                        if (zzfet2 != null) {
                            concurrentHashMap.remove(zzfet2);
                        }
                    } else if (i2 == 1) {
                        for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                            if (((zzfei) entry2.getValue()).zzd() < j) {
                                j = ((zzfei) entry2.getValue()).zzd();
                                zzfet2 = (zzfet) entry2.getKey();
                            }
                        }
                        if (zzfet2 != null) {
                            concurrentHashMap.remove(zzfet2);
                        }
                    } else if (i2 == 2) {
                        int i3 = IntCompanionObject.MAX_VALUE;
                        for (Map.Entry entry3 : concurrentHashMap.entrySet()) {
                            if (((zzfei) entry3.getValue()).zza() < i3) {
                                i3 = ((zzfei) entry3.getValue()).zza();
                                zzfet2 = (zzfet) entry3.getKey();
                            }
                        }
                        if (zzfet2 != null) {
                            concurrentHashMap.remove(zzfet2);
                        }
                    }
                    this.zzc.zzg();
                } else {
                    throw null;
                }
            }
            concurrentHashMap.put(zzfet, zzfei2);
            this.zzc.zzd();
            zzfei = zzfei2;
        }
        zzh = zzfei.zzh(zzfes);
        zzfem zzfem = this.zzc;
        zzfem.zzc();
        zzfel zza2 = zzfem.zza();
        zzffg zzf = zzfei.zzf();
        if (zzfes != null) {
            zzbcj.zzb.zzc zzd = zzbcj.zzb.zzd();
            zzbcj.zzb.zza.C0003zza zza3 = zzbcj.zzb.zza.zza();
            zza3.zzf(zzbcj.zzb.zzd.IN_MEMORY);
            zzbcj.zzb.zzg.zza zzb2 = zzbcj.zzb.zzg.zzb();
            zzb2.zze(zza2.zza);
            zzb2.zzf(zza2.zzb);
            zzb2.zzg(zzf.zzb);
            zza3.zzi(zzb2);
            zzd.zzd(zza3);
            zzfes.zza.zzb().zzc().zzj((zzbcj.zzb) zzd.zzbr());
        }
        zzf();
        return zzh;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r3.zzb() >= r1.zzd) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zze(com.google.android.gms.internal.ads.zzfet r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.ConcurrentHashMap r0 = r2.zza     // Catch:{ all -> 0x001c }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x001c }
            com.google.android.gms.internal.ads.zzfei r3 = (com.google.android.gms.internal.ads.zzfei) r3     // Catch:{ all -> 0x001c }
            r0 = 1
            if (r3 == 0) goto L_0x001a
            com.google.android.gms.internal.ads.zzfeq r1 = r2.zzb     // Catch:{ all -> 0x001c }
            int r3 = r3.zzb()     // Catch:{ all -> 0x001c }
            int r1 = r1.zzd     // Catch:{ all -> 0x001c }
            monitor-exit(r2)
            if (r3 >= r1) goto L_0x0018
            return r0
        L_0x0018:
            r3 = 0
            return r3
        L_0x001a:
            monitor-exit(r2)
            return r0
        L_0x001c:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfek.zze(com.google.android.gms.internal.ads.zzfet):boolean");
    }
}
