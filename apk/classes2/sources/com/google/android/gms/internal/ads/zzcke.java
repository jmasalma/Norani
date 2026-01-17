package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzda;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzfx;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzau;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcke extends zzda {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzdpz zzc;
    private final zzedo zzd;
    private final zzeju zze;
    private final zzdun zzf;
    private final zzbyo zzg;
    private final zzdqe zzh;
    private final zzdvi zzi;
    private final zzbfx zzj;
    private final zzfhx zzk;
    private final zzfds zzl;
    private final zzctl zzm;
    private final zzdsj zzn;
    private boolean zzo = false;
    private final Long zzp = Long.valueOf(zzv.zzD().elapsedRealtime());

    zzcke(Context context, VersionInfoParcel versionInfoParcel, zzdpz zzdpz, zzedo zzedo, zzeju zzeju, zzdun zzdun, zzbyo zzbyo, zzdqe zzdqe, zzdvi zzdvi, zzbfx zzbfx, zzfhx zzfhx, zzfds zzfds, zzctl zzctl, zzdsj zzdsj) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzdpz;
        this.zzd = zzedo;
        this.zze = zzeju;
        this.zzf = zzdun;
        this.zzg = zzbyo;
        this.zzh = zzdqe;
        this.zzi = zzdvi;
        this.zzj = zzbfx;
        this.zzk = zzfhx;
        this.zzl = zzfds;
        this.zzm = zzctl;
        this.zzn = zzdsj;
    }

    public static /* synthetic */ void zzc(zzcke zzcke, Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map zze2 = zzv.zzp().zzi().zzg().zze();
        if (!zze2.isEmpty()) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    int i = zze.zza;
                    zzo.zzk("Could not initialize rewarded ads.", th);
                    return;
                }
            }
            if (zzcke.zzc.zzd()) {
                HashMap hashMap = new HashMap();
                for (zzbpk zzbpk : zze2.values()) {
                    for (zzbpj zzbpj : zzbpk.zza) {
                        String str = zzbpj.zzb;
                        for (String str2 : zzbpj.zza) {
                            if (!hashMap.containsKey(str2)) {
                                hashMap.put(str2, new ArrayList());
                            }
                            if (str != null) {
                                ((List) hashMap.get(str2)).add(str);
                            }
                        }
                    }
                }
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str3 = (String) entry.getKey();
                    try {
                        zzedp zza2 = zzcke.zzd.zza(str3, jSONObject);
                        if (zza2 != null) {
                            zzfdu zzfdu = (zzfdu) zza2.zzb;
                            if (!zzfdu.zzC() && zzfdu.zzB()) {
                                zzfdu.zzj(zzcke.zza, (zzefe) zza2.zzc, (List) entry.getValue());
                                int i2 = zze.zza;
                                zzo.zze("Initialized rewarded video mediation adapter " + str3);
                            }
                        }
                    } catch (zzfdd e) {
                        int i3 = zze.zza;
                        zzo.zzk("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e);
                    }
                }
            }
        }
    }

    public final synchronized float zze() {
        return zzv.zzt().zza();
    }

    public final String zzf() {
        return this.zzb.afmaVersion;
    }

    public final List zzg() throws RemoteException {
        return this.zzf.zzg();
    }

    public final void zzh(String str) {
        this.zze.zzg(str);
    }

    public final void zzi() {
        this.zzf.zzq();
    }

    public final void zzj(boolean z) throws RemoteException {
        try {
            Context context = this.zza;
            zzfsb.zza(context).zzc(z);
            if (!z) {
                try {
                    if (!context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
                        throw new IOException("Failed to remove query_info_shared_prefs");
                    }
                } catch (IOException e) {
                    zzv.zzp().zzw(e, "clearStorageOnGpidPubDisable_scar");
                }
            }
        } catch (IOException e2) {
            throw new RemoteException(e2.getMessage());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d6, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzk() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzo     // Catch:{ all -> 0x00d7 }
            if (r0 == 0) goto L_0x000e
            int r0 = com.google.android.gms.ads.internal.util.zze.zza     // Catch:{ all -> 0x00d7 }
            java.lang.String r0 = "Mobile ads is initialized already."
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r0)     // Catch:{ all -> 0x00d7 }
            monitor-exit(r3)
            return
        L_0x000e:
            android.content.Context r0 = r3.zza     // Catch:{ all -> 0x00d7 }
            com.google.android.gms.internal.ads.zzbde.zza(r0)     // Catch:{ all -> 0x00d7 }
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r1 = r3.zzb     // Catch:{ all -> 0x00d7 }
            com.google.android.gms.internal.ads.zzbzs r2 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch:{ all -> 0x00d7 }
            r2.zzu(r0, r1)     // Catch:{ all -> 0x00d7 }
            com.google.android.gms.internal.ads.zzctl r1 = r3.zzm     // Catch:{ all -> 0x00d7 }
            r1.zzd()     // Catch:{ all -> 0x00d7 }
            com.google.android.gms.internal.ads.zzbbk r1 = com.google.android.gms.ads.internal.zzv.zzc()     // Catch:{ all -> 0x00d7 }
            r1.zzi(r0)     // Catch:{ all -> 0x00d7 }
            r0 = 1
            r3.zzo = r0     // Catch:{ all -> 0x00d7 }
            com.google.android.gms.internal.ads.zzdun r0 = r3.zzf     // Catch:{ all -> 0x00d7 }
            r0.zzr()     // Catch:{ all -> 0x00d7 }
            com.google.android.gms.internal.ads.zzeju r0 = r3.zze     // Catch:{ all -> 0x00d7 }
            r0.zzf()     // Catch:{ all -> 0x00d7 }
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzeq     // Catch:{ all -> 0x00d7 }
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x00d7 }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x00d7 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00d7 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00d7 }
            if (r0 == 0) goto L_0x004c
            com.google.android.gms.internal.ads.zzdqe r0 = r3.zzh     // Catch:{ all -> 0x00d7 }
            r0.zzf()     // Catch:{ all -> 0x00d7 }
        L_0x004c:
            com.google.android.gms.internal.ads.zzdvi r0 = r3.zzi     // Catch:{ all -> 0x00d7 }
            r0.zzg()     // Catch:{ all -> 0x00d7 }
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzjE     // Catch:{ all -> 0x00d7 }
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x00d7 }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x00d7 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00d7 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00d7 }
            if (r0 == 0) goto L_0x006d
            com.google.android.gms.internal.ads.zzgdy r0 = com.google.android.gms.internal.ads.zzcaf.zza     // Catch:{ all -> 0x00d7 }
            com.google.android.gms.internal.ads.zzcjz r1 = new com.google.android.gms.internal.ads.zzcjz     // Catch:{ all -> 0x00d7 }
            r1.<init>(r3)     // Catch:{ all -> 0x00d7 }
            r0.execute(r1)     // Catch:{ all -> 0x00d7 }
        L_0x006d:
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzls     // Catch:{ all -> 0x00d7 }
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x00d7 }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x00d7 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00d7 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00d7 }
            if (r0 == 0) goto L_0x0089
            com.google.android.gms.internal.ads.zzgdy r0 = com.google.android.gms.internal.ads.zzcaf.zza     // Catch:{ all -> 0x00d7 }
            com.google.android.gms.internal.ads.zzckc r1 = new com.google.android.gms.internal.ads.zzckc     // Catch:{ all -> 0x00d7 }
            r1.<init>(r3)     // Catch:{ all -> 0x00d7 }
            r0.execute(r1)     // Catch:{ all -> 0x00d7 }
        L_0x0089:
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzdl     // Catch:{ all -> 0x00d7 }
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x00d7 }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x00d7 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00d7 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00d7 }
            if (r0 == 0) goto L_0x00a5
            com.google.android.gms.internal.ads.zzgdy r0 = com.google.android.gms.internal.ads.zzcaf.zza     // Catch:{ all -> 0x00d7 }
            com.google.android.gms.internal.ads.zzcka r1 = new com.google.android.gms.internal.ads.zzcka     // Catch:{ all -> 0x00d7 }
            r1.<init>(r3)     // Catch:{ all -> 0x00d7 }
            r0.execute(r1)     // Catch:{ all -> 0x00d7 }
        L_0x00a5:
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzeT     // Catch:{ all -> 0x00d7 }
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x00d7 }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x00d7 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00d7 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00d7 }
            if (r0 == 0) goto L_0x00d5
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzeU     // Catch:{ all -> 0x00d7 }
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x00d7 }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x00d7 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00d7 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00d7 }
            if (r0 == 0) goto L_0x00d5
            com.google.android.gms.internal.ads.zzgdy r0 = com.google.android.gms.internal.ads.zzcaf.zza     // Catch:{ all -> 0x00d7 }
            com.google.android.gms.internal.ads.zzckb r1 = new com.google.android.gms.internal.ads.zzckb     // Catch:{ all -> 0x00d7 }
            r1.<init>(r3)     // Catch:{ all -> 0x00d7 }
            r0.execute(r1)     // Catch:{ all -> 0x00d7 }
            monitor-exit(r3)
            return
        L_0x00d5:
            monitor-exit(r3)
            return
        L_0x00d7:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00d7 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcke.zzk():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzl(java.lang.String r13, com.google.android.gms.dynamic.IObjectWrapper r14) {
        /*
            r12 = this;
            android.content.Context r0 = r12.zza
            com.google.android.gms.internal.ads.zzbde.zza(r0)
            com.google.android.gms.internal.ads.zzbcv r1 = com.google.android.gms.internal.ads.zzbde.zzev
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x002b
            com.google.android.gms.ads.internal.zzv.zzr()     // Catch:{ RuntimeException -> 0x0021, RemoteException -> 0x001f }
            java.lang.String r0 = com.google.android.gms.ads.internal.util.zzs.zzq(r0)     // Catch:{ RuntimeException -> 0x0021, RemoteException -> 0x001f }
            goto L_0x002d
        L_0x001f:
            r0 = move-exception
            goto L_0x0022
        L_0x0021:
            r0 = move-exception
        L_0x0022:
            java.lang.String r1 = "NonagonMobileAdsSettingManager_AppId"
            com.google.android.gms.internal.ads.zzbzs r2 = com.google.android.gms.ads.internal.zzv.zzp()
            r2.zzw(r0, r1)
        L_0x002b:
            java.lang.String r0 = ""
        L_0x002d:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 1
            if (r2 != r1) goto L_0x0036
            r6 = r13
            goto L_0x0037
        L_0x0036:
            r6 = r0
        L_0x0037:
            boolean r13 = android.text.TextUtils.isEmpty(r6)
            if (r13 == 0) goto L_0x003e
            goto L_0x0097
        L_0x003e:
            com.google.android.gms.internal.ads.zzbcv r13 = com.google.android.gms.internal.ads.zzbde.zzeo
            com.google.android.gms.internal.ads.zzbdc r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r13 = r0.zzb(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzbe
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r1.zzb(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r13 = r13 | r1
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x007b
            java.lang.Object r13 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r14)
            java.lang.Runnable r13 = (java.lang.Runnable) r13
            com.google.android.gms.internal.ads.zzckd r14 = new com.google.android.gms.internal.ads.zzckd
            r14.<init>(r12, r13)
            goto L_0x007d
        L_0x007b:
            r14 = 0
            r2 = r13
        L_0x007d:
            r7 = r14
            if (r2 == 0) goto L_0x0097
            android.content.Context r4 = r12.zza
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r5 = r12.zzb
            com.google.android.gms.internal.ads.zzfhx r8 = r12.zzk
            com.google.android.gms.internal.ads.zzdsj r9 = r12.zzn
            java.lang.Long r10 = r12.zzp
            com.google.android.gms.internal.ads.zzdvi r13 = r12.zzi
            com.google.android.gms.ads.internal.zzf r3 = com.google.android.gms.ads.internal.zzv.zza()
            boolean r11 = r13.zzq()
            r3.zzc(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcke.zzl(java.lang.String, com.google.android.gms.dynamic.IObjectWrapper):void");
    }

    public final void zzm(zzdn zzdn) throws RemoteException {
        this.zzi.zzh(zzdn, zzdvh.API);
    }

    public final void zzn(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            int i = zze.zza;
            zzo.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (context == null) {
            int i2 = zze.zza;
            zzo.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        zzau zzau = new zzau(context);
        zzau.zzn(str);
        zzau.zzo(this.zzb.afmaVersion);
        zzau.zzr();
    }

    public final void zzo(zzbpq zzbpq) throws RemoteException {
        this.zzl.zzf(zzbpq);
    }

    public final synchronized void zzp(boolean z) {
        zzv.zzt().zzc(z);
    }

    public final synchronized void zzq(float f) {
        zzv.zzt().zzd(f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzr(java.lang.String r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            android.content.Context r1 = r9.zza     // Catch:{ all -> 0x0038 }
            com.google.android.gms.internal.ads.zzbde.zza(r1)     // Catch:{ all -> 0x0038 }
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x0036
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzeo     // Catch:{ all -> 0x0038 }
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x0038 }
            java.lang.Object r0 = r2.zzb(r0)     // Catch:{ all -> 0x0038 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0038 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0036
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = r9.zzb     // Catch:{ all -> 0x0038 }
            com.google.android.gms.internal.ads.zzfhx r5 = r9.zzk     // Catch:{ all -> 0x0038 }
            com.google.android.gms.internal.ads.zzdvi r0 = r9.zzi     // Catch:{ all -> 0x0038 }
            com.google.android.gms.ads.internal.zzf r3 = com.google.android.gms.ads.internal.zzv.zza()     // Catch:{ all -> 0x0038 }
            boolean r8 = r0.zzq()     // Catch:{ all -> 0x0038 }
            r4 = 0
            r6 = 0
            r7 = 0
            r0 = r3
            r3 = r10
            r0.zzc(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0038 }
            monitor-exit(r9)
            return
        L_0x0036:
            monitor-exit(r9)
            return
        L_0x0038:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0038 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcke.zzr(java.lang.String):void");
    }

    public final void zzs(zzbmk zzbmk) throws RemoteException {
        this.zzf.zzs(zzbmk);
    }

    public final void zzt(String str) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzjQ)).booleanValue()) {
            zzv.zzp().zzz(str);
        }
    }

    public final void zzu(zzfx zzfx) throws RemoteException {
        this.zzg.zzn(this.zza, zzfx);
    }

    public final synchronized boolean zzv() {
        return zzv.zzt().zze();
    }

    /* access modifiers changed from: package-private */
    public final void zzx() {
        if (zzv.zzp().zzi().zzM()) {
            String zzi2 = zzv.zzp().zzi().zzi();
            if (!zzv.zzu().zzj(this.zza, zzi2, this.zzb.afmaVersion)) {
                zzv.zzp().zzi().zzx(false);
                zzv.zzp().zzi().zzw("");
            }
        }
    }
}
