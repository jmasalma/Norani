package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeab extends zzbvd {
    private final Context zza;
    private final zzgdy zzb;
    private final zzeaj zzc;
    private final zzcld zzd;
    private final ArrayDeque zze;
    private final zzfhx zzf;
    private final zzbvy zzg;

    public zzeab(Context context, zzgdy zzgdy, zzbvy zzbvy, zzcld zzcld, zzeaj zzeaj, ArrayDeque arrayDeque, zzeag zzeag, zzfhx zzfhx) {
        zzbde.zza(context);
        this.zza = context;
        this.zzb = zzgdy;
        this.zzg = zzbvy;
        this.zzc = zzeaj;
        this.zzd = zzcld;
        this.zze = arrayDeque;
        this.zzf = zzfhx;
    }

    public static /* synthetic */ InputStream zzk(zzeab zzeab, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzbvq zzbvq, zzfhj zzfhj) {
        String zze2 = ((zzbvs) listenableFuture.get()).zze();
        String str = zzbvq.zzh;
        zzeab.zzo(new zzdzy((zzbvs) listenableFuture.get(), (JSONObject) listenableFuture2.get(), str, zze2, zzfhj));
        return new ByteArrayInputStream(zze2.getBytes(StandardCharsets.UTF_8));
    }

    private final synchronized zzdzy zzl(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzdzy zzdzy = (zzdzy) it.next();
            if (zzdzy.zzc.equals(str)) {
                it.remove();
                return zzdzy;
            }
        }
        return null;
    }

    private static ListenableFuture zzm(ListenableFuture listenableFuture, zzfha zzfha, zzbow zzbow, zzfhu zzfhu, zzfhj zzfhj) {
        zzbom zza2 = zzbow.zza("AFMA_getAdDictionary", zzbot.zza, new zzdzs());
        zzfht.zzd(listenableFuture, zzfhj);
        zzfgg zza3 = zzfha.zzb(zzfgu.BUILD_URL, listenableFuture).zzf(zza2).zza();
        zzfht.zzc(zza3, zzfhu, zzfhj);
        return zza3;
    }

    private static ListenableFuture zzn(zzbvq zzbvq, zzfha zzfha, zzevf zzevf) {
        zzdzm zzdzm = new zzdzm(zzevf, zzbvq);
        return zzfha.zzb(zzfgu.GMS_SIGNALS, zzgdn.zzh(zzbvq.zza)).zzf(zzdzm).zze(new zzdzn()).zza();
    }

    private final synchronized void zzo(zzdzy zzdzy) {
        zzp();
        this.zze.addLast(zzdzy);
    }

    private final synchronized void zzp() {
        int intValue = ((Long) zzbfl.zzb.zze()).intValue();
        while (true) {
            ArrayDeque arrayDeque = this.zze;
            if (arrayDeque.size() >= intValue) {
                arrayDeque.removeFirst();
            }
        }
    }

    private final void zzq(ListenableFuture listenableFuture, zzbvi zzbvi, zzbvq zzbvq) {
        zzgdn.zzr(zzgdn.zzn(listenableFuture, new zzdzt(this), zzcaf.zza), new zzdzx(this, zzbvq, zzbvi), zzcaf.zzg);
    }

    public final ListenableFuture zzb(zzbvq zzbvq, int i) {
        if (!((Boolean) zzbfl.zza.zze()).booleanValue()) {
            return zzgdn.zzg(new Exception("Split request is disabled."));
        }
        zzfeq zzfeq = zzbvq.zzi;
        if (zzfeq == null) {
            return zzgdn.zzg(new Exception("Pool configuration missing from request."));
        }
        if (zzfeq.zzc == 0 || zzfeq.zzd == 0) {
            return zzgdn.zzg(new Exception("Caching is disabled."));
        }
        Context context = this.zza;
        zzbow zzb2 = zzv.zzg().zzb(context, VersionInfoParcel.forPackage(), this.zzf);
        zzevf zzq = this.zzd.zzq(zzbvq, i);
        zzfha zze2 = zzq.zze();
        ListenableFuture zzn = zzn(zzbvq, zze2, zzq);
        zzfhu zzf2 = zzq.zzf();
        zzfhj zza2 = zzfhi.zza(context, 9);
        ListenableFuture zzm = zzm(zzn, zze2, zzb2, zzf2, zza2);
        return zze2.zza(zzfgu.GET_URL_AND_CACHE_KEY, zzn, zzm).zza(new zzdzq(this, zzm, zzn, zzbvq, zza2)).zza();
    }

    public final ListenableFuture zzc(zzbvq zzbvq, int i) {
        zzdzy zzdzy;
        zzfhj zzfhj;
        zzfgg zzfgg;
        zzbvq zzbvq2 = zzbvq;
        int i2 = i;
        zzbon zzg2 = zzv.zzg();
        Context context = this.zza;
        zzbow zzb2 = zzg2.zzb(context, VersionInfoParcel.forPackage(), this.zzf);
        zzevf zzq = this.zzd.zzq(zzbvq2, i2);
        zzbom zza2 = zzb2.zza("google.afma.response.normalize", zzeaa.zza, zzbot.zzb);
        if (!((Boolean) zzbfl.zza.zze()).booleanValue()) {
            String str = zzbvq2.zzj;
            zzdzy = null;
            if (str != null && !str.isEmpty()) {
                zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        } else {
            zzdzy = zzl(zzbvq2.zzh);
            if (zzdzy == null) {
                zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        }
        if (zzdzy == null) {
            zzfhj = zzfhi.zza(context, 9);
        } else {
            zzfhj = zzdzy.zzd;
        }
        zzfhu zzf2 = zzq.zzf();
        zzf2.zzd(zzbvq2.zza.getStringArrayList("ad_types"));
        zzeai zzeai = new zzeai(zzbvq2.zzg, zzf2, zzfhj);
        zzeaf zzeaf = new zzeaf(context, zzbvq2.zzb.afmaVersion, this.zzg, i2);
        zzfha zze2 = zzq.zze();
        zzfhj zza3 = zzfhi.zza(context, 11);
        if (zzdzy == null) {
            ListenableFuture zzn = zzn(zzbvq2, zze2, zzq);
            ListenableFuture zzm = zzm(zzn, zze2, zzb2, zzf2, zzfhj);
            zzfhj zza4 = zzfhi.zza(context, 10);
            zzfgg zza5 = zze2.zza(zzfgu.HTTP, zzm, zzn).zza(new zzdzo(zzm, zzbvq2, zzn)).zze(zzeai).zze(new zzfhp(zza4)).zze(zzeaf).zza();
            zzfht.zza(zza5, zzf2, zza4);
            zzfht.zzd(zza5, zza3);
            zzfgg = zze2.zza(zzfgu.PRE_PROCESS, zzn, zzm, zza5).zza(new zzdzp(zzbvq2, zza5, zzn, zzm)).zzf(zza2).zza();
        } else {
            zzeah zzeah = new zzeah(zzdzy.zzb, zzdzy.zza);
            zzfhj zza6 = zzfhi.zza(context, 10);
            zzfgg zza7 = zze2.zzb(zzfgu.HTTP, zzgdn.zzh(zzeah)).zze(zzeai).zze(new zzfhp(zza6)).zze(zzeaf).zza();
            zzfht.zza(zza7, zzf2, zza6);
            ListenableFuture zzh = zzgdn.zzh(zzdzy);
            zzfht.zzd(zza7, zza3);
            zzfgg = zze2.zza(zzfgu.PRE_PROCESS, zza7, zzh).zza(new zzdzl(zza7, zzh)).zzf(zza2).zza();
        }
        zzfht.zza(zzfgg, zzf2, zza3);
        return zzfgg;
    }

    public final ListenableFuture zzd(zzbvq zzbvq, int i) {
        zzbon zzg2 = zzv.zzg();
        Context context = this.zza;
        zzbow zzb2 = zzg2.zzb(context, VersionInfoParcel.forPackage(), this.zzf);
        if (!((Boolean) zzbfq.zza.zze()).booleanValue()) {
            return zzgdn.zzg(new Exception("Signal collection disabled."));
        }
        zzevf zzq = this.zzd.zzq(zzbvq, i);
        zzeuf zza2 = zzq.zza();
        zzbom zza3 = zzb2.zza("google.afma.request.getSignals", zzbot.zza, zzbot.zzb);
        zzfhj zza4 = zzfhi.zza(context, 22);
        zzfha zze2 = zzq.zze();
        zzfgu zzfgu = zzfgu.GET_SIGNALS;
        Bundle bundle = zzbvq.zza;
        zzfgg zza5 = zze2.zzb(zzfgu, zzgdn.zzh(bundle)).zze(new zzfhp(zza4)).zzf(new zzdzu(zza2, zzbvq)).zzb(zzfgu.JS_SIGNALS).zzf(zza3).zza();
        zzfhu zzf2 = zzq.zzf();
        zzf2.zzd(bundle.getStringArrayList("ad_types"));
        zzf2.zzf(bundle.getBundle("extras"));
        zzfht.zzb(zza5, zzf2, zza4);
        if (((Boolean) zzbfe.zzf.zze()).booleanValue()) {
            zzeaj zzeaj = this.zzc;
            Objects.requireNonNull(zzeaj);
            zza5.addListener(new zzdzr(zzeaj), this.zzb);
        }
        return zza5;
    }

    public final void zze(zzbvq zzbvq, zzbvi zzbvi) {
        zzq(zzb(zzbvq, Binder.getCallingUid()), zzbvi, zzbvq);
    }

    public final void zzf(zzbvq zzbvq, zzbvi zzbvi) {
        Bundle bundle;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcq)).booleanValue() && (bundle = zzbvq.zzm) != null) {
            bundle.putLong(zzdrr.SERVICE_CONNECTED.zza(), zzv.zzD().currentTimeMillis());
        }
        zzq(zzd(zzbvq, Binder.getCallingUid()), zzbvi, zzbvq);
    }

    public final void zzg(zzbvq zzbvq, zzbvi zzbvi) {
        Bundle bundle;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcq)).booleanValue() && (bundle = zzbvq.zzm) != null) {
            bundle.putLong(zzdrr.SERVICE_CONNECTED.zza(), zzv.zzD().currentTimeMillis());
        }
        ListenableFuture zzc2 = zzc(zzbvq, Binder.getCallingUid());
        zzq(zzc2, zzbvi, zzbvq);
        if (((Boolean) zzbfe.zze.zze()).booleanValue()) {
            zzeaj zzeaj = this.zzc;
            Objects.requireNonNull(zzeaj);
            zzc2.addListener(new zzdzr(zzeaj), this.zzb);
        }
    }

    public final void zzh(String str, zzbvi zzbvi) {
        zzq(zzj(str), zzbvi, (zzbvq) null);
    }

    public final void zzi(zzbva zzbva, zzbvj zzbvj) {
        if (!((Boolean) zzbfs.zza.zze()).booleanValue()) {
            try {
                zzbvj.zzf("", zzbva);
            } catch (RemoteException e) {
                zze.zzb("Service can't call client", e);
            }
        } else {
            this.zzd.zzD();
            String str = zzbva.zza;
            zzgdn.zzr(zzgdn.zzh((Object) null), new zzdzv(this, zzbvj, zzbva), zzcaf.zzg);
        }
    }

    public final ListenableFuture zzj(String str) {
        if (!((Boolean) zzbfl.zza.zze()).booleanValue()) {
            return zzgdn.zzg(new Exception("Split request is disabled."));
        }
        zzdzw zzdzw = new zzdzw(this);
        if (zzl(str) == null) {
            return zzgdn.zzg(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str))));
        }
        return zzgdn.zzh(zzdzw);
    }
}
