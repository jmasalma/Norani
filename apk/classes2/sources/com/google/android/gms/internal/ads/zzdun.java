package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdun {
    private boolean zza = false;
    private boolean zzb = false;
    /* access modifiers changed from: private */
    public boolean zzc = false;
    /* access modifiers changed from: private */
    public final long zzd;
    /* access modifiers changed from: private */
    public final zzcak zze = new zzcak();
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdpz zzh;
    /* access modifiers changed from: private */
    public final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    /* access modifiers changed from: private */
    public final zzdsu zzl;
    private final VersionInfoParcel zzm;
    private final Map zzn = new ConcurrentHashMap();
    /* access modifiers changed from: private */
    public final zzddc zzo;
    /* access modifiers changed from: private */
    public final zzfhx zzp;
    private boolean zzq = true;

    public zzdun(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdpz zzdpz, ScheduledExecutorService scheduledExecutorService, zzdsu zzdsu, VersionInfoParcel versionInfoParcel, zzddc zzddc, zzfhx zzfhx) {
        this.zzh = zzdpz;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdsu;
        this.zzm = versionInfoParcel;
        this.zzo = zzddc;
        this.zzp = zzfhx;
        this.zzd = zzv.zzD().elapsedRealtime();
        zzv("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    public static /* synthetic */ Object zzf(zzdun zzdun, zzfhj zzfhj) {
        zzdun.zze.zzc(true);
        zzfhj.zzg(true);
        zzdun.zzp.zzc(zzfhj.zzm());
        return null;
    }

    public static /* synthetic */ void zzi(zzdun zzdun, Object obj, zzcak zzcak, String str, long j, zzfhj zzfhj) {
        synchronized (obj) {
            if (!zzcak.isDone()) {
                zzdun.zzv(str, false, "Timeout.", (int) (zzv.zzD().elapsedRealtime() - j));
                zzdun.zzl.zzb(str, "timeout");
                zzdun.zzo.zzb(str, "timeout");
                zzfhx zzfhx = zzdun.zzp;
                zzfhj.zzc("Timeout");
                zzfhj.zzg(false);
                zzfhx.zzc(zzfhj.zzm());
                zzcak.zzc(false);
            }
        }
    }

    public static /* synthetic */ void zzj(zzdun zzdun) {
        zzdun.zzl.zze();
        zzdun.zzo.zze();
        zzdun.zzb = true;
    }

    public static /* synthetic */ void zzl(zzdun zzdun) {
        synchronized (zzdun) {
            if (!zzdun.zzc) {
                zzdun.zzv("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (zzv.zzD().elapsedRealtime() - zzdun.zzd));
                zzdun.zzl.zzb("com.google.android.gms.ads.MobileAds", "timeout");
                zzdun.zzo.zzb("com.google.android.gms.ads.MobileAds", "timeout");
                zzdun.zze.zzd(new Exception());
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0026 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void zzm(com.google.android.gms.internal.ads.zzdun r2, java.lang.String r3, com.google.android.gms.internal.ads.zzbmh r4, com.google.android.gms.internal.ads.zzfdu r5, java.util.List r6) {
        /*
            java.lang.String r0 = "Failed to initialize adapter. "
            java.lang.String r1 = "com.google.ads.mediation.admob.AdMobAdapter"
            boolean r1 = java.util.Objects.equals(r3, r1)     // Catch:{ zzfdd -> 0x0026, RemoteException -> 0x001f }
            if (r1 == 0) goto L_0x000e
            r4.zzf()     // Catch:{ zzfdd -> 0x0026, RemoteException -> 0x001f }
            return
        L_0x000e:
            java.lang.ref.WeakReference r1 = r2.zzg     // Catch:{ zzfdd -> 0x0026, RemoteException -> 0x001f }
            java.lang.Object r1 = r1.get()     // Catch:{ zzfdd -> 0x0026, RemoteException -> 0x001f }
            android.content.Context r1 = (android.content.Context) r1     // Catch:{ zzfdd -> 0x0026, RemoteException -> 0x001f }
            if (r1 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            android.content.Context r1 = r2.zzf     // Catch:{ zzfdd -> 0x0026, RemoteException -> 0x001f }
        L_0x001b:
            r5.zzi(r1, r4, r6)     // Catch:{ zzfdd -> 0x0026, RemoteException -> 0x001f }
            return
        L_0x001f:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzfwn r3 = new com.google.android.gms.internal.ads.zzfwn
            r3.<init>(r2)
            throw r3
        L_0x0026:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x003b }
            r2.<init>(r0)     // Catch:{ RemoteException -> 0x003b }
            r2.append(r3)     // Catch:{ RemoteException -> 0x003b }
            java.lang.String r3 = " does not implement the initialize() method."
            r2.append(r3)     // Catch:{ RemoteException -> 0x003b }
            java.lang.String r2 = r2.toString()     // Catch:{ RemoteException -> 0x003b }
            r4.zze(r2)     // Catch:{ RemoteException -> 0x003b }
            return
        L_0x003b:
            r2 = move-exception
            int r3 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r3 = ""
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdun.zzm(com.google.android.gms.internal.ads.zzdun, java.lang.String, com.google.android.gms.internal.ads.zzbmh, com.google.android.gms.internal.ads.zzfdu, java.util.List):void");
    }

    static /* bridge */ /* synthetic */ void zzo(zzdun zzdun, String str) {
        zzdun zzdun2 = zzdun;
        Context context = zzdun2.zzf;
        int i = 5;
        zzfhj zza2 = zzfhi.zza(context, 5);
        zza2.zzi();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                zzfhj zza3 = zzfhi.zza(context, i);
                zza3.zzi();
                zza3.zzd(next);
                Object obj = new Object();
                zzcak zzcak = new zzcak();
                ListenableFuture zzo2 = zzgdn.zzo(zzcak, ((Long) zzbd.zzc().zzb(zzbde.zzca)).longValue(), TimeUnit.SECONDS, zzdun2.zzk);
                zzdun2.zzl.zzc(next);
                zzdun2.zzo.zzc(next);
                long elapsedRealtime = zzv.zzD().elapsedRealtime();
                zzdud zzdud = r1;
                ListenableFuture listenableFuture = zzo2;
                zzfhj zzfhj = zza3;
                Context context2 = context;
                JSONObject jSONObject2 = jSONObject;
                zzdud zzdud2 = new zzdud(zzdun, obj, zzcak, next, elapsedRealtime, zzfhj);
                listenableFuture.addListener(zzdud, zzdun2.zzi);
                arrayList.add(listenableFuture);
                zzdum zzdum = new zzdum(zzdun, obj, next, elapsedRealtime, zzfhj, zzcak);
                JSONObject optJSONObject = jSONObject2.optJSONObject(next);
                ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        int i2 = 0;
                        while (i2 < jSONArray.length()) {
                            JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                            String optString = jSONObject3.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject3.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new zzbmn(optString, bundle));
                            i2++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                zzdun2.zzv(next, false, "", 0);
                try {
                    zzdun2.zzj.execute(new zzdui(zzdun, next, zzdum, zzdun2.zzh.zzc(next, new JSONObject()), arrayList2));
                } catch (zzfdd e) {
                    String str2 = "Failed to create Adapter.";
                    try {
                        if (((Boolean) zzbd.zzc().zzb(zzbde.zzns)).booleanValue()) {
                            str2 = str2 + " " + e.getMessage();
                        }
                        zzdum.zze(str2);
                    } catch (RemoteException e2) {
                        int i3 = zze.zza;
                        zzo.zzh("", e2);
                    }
                }
                jSONObject = jSONObject2;
                context = context2;
                i = 5;
            }
            zzgdn.zza(arrayList).zza(new zzdue(zzdun2, zza2), zzdun2.zzi);
        } catch (JSONException e3) {
            zze.zzb("Malformed CLD response", e3);
            zzdun2.zzo.zza("MalformedJson");
            zzdun2.zzl.zza("MalformedJson");
            zzdun2.zze.zzd(e3);
            zzv.zzp().zzw(e3, "AdapterInitializer.updateAdapterStatus");
            zzfhx zzfhx = zzdun2.zzp;
            zza2.zzh(e3);
            zza2.zzg(false);
            zzfhx.zzc(zza2.zzm());
        }
    }

    private final synchronized ListenableFuture zzu() {
        String zzc2 = zzv.zzp().zzi().zzg().zzc();
        if (!TextUtils.isEmpty(zzc2)) {
            return zzgdn.zzh(zzc2);
        }
        zzcak zzcak = new zzcak();
        zzv.zzp().zzi().zzo(new zzduf(this, zzcak));
        return zzcak;
    }

    /* access modifiers changed from: private */
    public final void zzv(String str, boolean z, String str2, int i) {
        this.zzn.put(str, new zzbmd(str, z, i, str2));
    }

    public final List zzg() {
        ArrayList arrayList = new ArrayList();
        Map map = this.zzn;
        for (String str : map.keySet()) {
            zzbmd zzbmd = (zzbmd) map.get(str);
            arrayList.add(new zzbmd(str, zzbmd.zzb, zzbmd.zzc, zzbmd.zzd));
        }
        return arrayList;
    }

    public final void zzq() {
        this.zzq = false;
    }

    public final void zzr() {
        if (!((Boolean) zzbfk.zza.zze()).booleanValue()) {
            if (this.zzm.clientJarVersion >= ((Integer) zzbd.zzc().zzb(zzbde.zzbZ)).intValue() && this.zzq) {
                if (!this.zza) {
                    synchronized (this) {
                        if (!this.zza) {
                            this.zzl.zzf();
                            this.zzo.zzf();
                            zzcak zzcak = this.zze;
                            zzduj zzduj = new zzduj(this);
                            Executor executor = this.zzi;
                            zzcak.addListener(zzduj, executor);
                            this.zza = true;
                            ListenableFuture zzu = zzu();
                            this.zzk.schedule(new zzduc(this), ((Long) zzbd.zzc().zzb(zzbde.zzcb)).longValue(), TimeUnit.SECONDS);
                            zzgdn.zzr(zzu, new zzdul(this), executor);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
        if (!this.zza) {
            zzv("com.google.android.gms.ads.MobileAds", true, "", 0);
            this.zze.zzc(false);
            this.zza = true;
            this.zzb = true;
        }
    }

    public final void zzs(zzbmk zzbmk) {
        this.zze.addListener(new zzdug(this, zzbmk), this.zzj);
    }

    public final boolean zzt() {
        return this.zzb;
    }
}
