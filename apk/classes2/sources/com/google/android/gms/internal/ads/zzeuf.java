package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeuf {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfhu zzd;
    private final zzdsj zze;
    private long zzf = 0;
    private int zzg = 0;

    public zzeuf(Context context, Executor executor, Set set, zzfhu zzfhu, zzdsj zzdsj) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfhu;
        this.zze = zzdsj;
    }

    public static /* synthetic */ void zzb(zzeuf zzeuf, long j, zzeuc zzeuc, Bundle bundle) {
        long elapsedRealtime = zzv.zzD().elapsedRealtime() - j;
        if (((Boolean) zzbfg.zza.zze()).booleanValue()) {
            zze.zza("Signal runtime (ms) : " + zzfwg.zzc(zzeuc.getClass().getCanonicalName()) + " = " + elapsedRealtime);
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcq)).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzcw)).booleanValue()) {
                synchronized (zzeuf) {
                    bundle.putLong("sig" + zzeuc.zza(), elapsedRealtime);
                }
            }
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzco)).booleanValue()) {
            zzdsi zza2 = zzeuf.zze.zza();
            zza2.zzb("action", "lat_ms");
            zza2.zzb("lat_grp", "sig_lat_grp");
            zza2.zzb("lat_id", String.valueOf(zzeuc.zza()));
            zza2.zzb("clat_ms", String.valueOf(elapsedRealtime));
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzcp)).booleanValue()) {
                synchronized (zzeuf) {
                    zzeuf.zzg++;
                }
                zza2.zzb("seq_num", zzv.zzp().zzh().zzd());
                synchronized (zzeuf) {
                    if (zzeuf.zzg == zzeuf.zzb.size() && zzeuf.zzf != 0) {
                        zzeuf.zzg = 0;
                        String valueOf = String.valueOf(zzv.zzD().elapsedRealtime() - zzeuf.zzf);
                        if (zzeuc.zza() <= 39 || zzeuc.zza() >= 52) {
                            zza2.zzb("lat_clsg", valueOf);
                        } else {
                            zza2.zzb("lat_gmssg", valueOf);
                        }
                    }
                }
            }
            zza2.zzk();
        }
    }

    public final ListenableFuture zza(Object obj, Bundle bundle, boolean z) {
        Bundle bundle2 = bundle;
        zzfhj zza2 = zzfhi.zza(this.zza, 8);
        zza2.zzi();
        Set<zzeuc> set = this.zzb;
        ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        zzbcv zzbcv = zzbde.zzmg;
        if (!((String) zzbd.zzc().zzb(zzbcv)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) zzbd.zzc().zzb(zzbcv)).split(","));
        }
        List list = arrayList2;
        this.zzf = zzv.zzD().elapsedRealtime();
        Bundle bundle3 = new Bundle();
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzcq)).booleanValue() || bundle2 == null) {
            Object obj2 = obj;
        } else {
            long currentTimeMillis = zzv.zzD().currentTimeMillis();
            if (obj instanceof zzcva) {
                bundle2.putLong(zzdrr.CLIENT_SIGNALS_START.zza(), currentTimeMillis);
            } else {
                bundle2.putLong(zzdrr.GMS_SIGNALS_START.zza(), currentTimeMillis);
            }
        }
        for (zzeuc zzeuc : set) {
            if (!list.contains(String.valueOf(zzeuc.zza()))) {
                long elapsedRealtime = zzv.zzD().elapsedRealtime();
                ListenableFuture zzb2 = zzeuc.zzb();
                zzb2.addListener(new zzeud(this, elapsedRealtime, zzeuc, bundle3), zzcaf.zzg);
                arrayList.add(zzb2);
            }
        }
        ListenableFuture zza3 = zzgdn.zzb(arrayList).zza(new zzeue(arrayList, obj, z, bundle, bundle3), this.zzc);
        if (zzfhx.zza()) {
            zzfht.zza(zza3, this.zzd, zza2);
        }
        return zza3;
    }
}
