package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeti implements zzeuc {
    public static final /* synthetic */ int zzb = 0;
    private static final zzetj zzc = new zzetj(new JSONArray().toString(), new Bundle());
    final String zza;
    private final zzgdy zzd;
    private final ScheduledExecutorService zze;
    private final zzeju zzf;
    private final Context zzg;
    private final zzfcw zzh;
    private final zzejq zzi;
    private final zzdpz zzj;
    private final zzdup zzk;
    private final int zzl;

    zzeti(zzgdy zzgdy, ScheduledExecutorService scheduledExecutorService, String str, zzeju zzeju, Context context, zzfcw zzfcw, zzejq zzejq, zzdpz zzdpz, zzdup zzdup, int i) {
        this.zzd = zzgdy;
        this.zze = scheduledExecutorService;
        this.zza = str;
        this.zzf = zzeju;
        this.zzg = context;
        this.zzh = zzfcw;
        this.zzi = zzejq;
        this.zzj = zzdpz;
        this.zzk = zzdup;
        this.zzl = i;
    }

    public static /* synthetic */ ListenableFuture zzc(zzeti zzeti) {
        String str;
        Bundle bundle;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzlq)).booleanValue()) {
            str = zzeti.zzh.zzf.toLowerCase(Locale.ROOT);
        } else {
            str = zzeti.zzh.zzf;
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzbP)).booleanValue()) {
            bundle = zzeti.zzk.zzg();
        } else {
            bundle = new Bundle();
        }
        ArrayList arrayList = new ArrayList();
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzbY)).booleanValue()) {
            zzeju zzeju = zzeti.zzf;
            for (Map.Entry entry : ((zzfyt) zzeju.zzb(zzeti.zza, str)).entrySet()) {
                String str2 = (String) entry.getKey();
                arrayList.add(zzeti.zzg(str2, (List) entry.getValue(), zzeti.zzf(str2), true, true));
            }
            zzeti.zzi(arrayList, zzeju.zzc());
        } else {
            zzeti.zzi(arrayList, zzeti.zzf.zza(zzeti.zza, str));
        }
        return zzgdn.zzb(arrayList).zza(new zzetd(arrayList, bundle), zzeti.zzd);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzd(com.google.android.gms.internal.ads.zzeti r8, java.lang.String r9, java.util.List r10, android.os.Bundle r11, boolean r12, boolean r13) {
        /*
            com.google.android.gms.internal.ads.zzcak r7 = new com.google.android.gms.internal.ads.zzcak
            r7.<init>()
            r0 = 0
            if (r13 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzbcv r13 = com.google.android.gms.internal.ads.zzbde.zzbQ
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r13 = r1.zzb(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzejq r13 = r8.zzi
            r13.zzb(r9)
            com.google.android.gms.internal.ads.zzbrp r13 = r13.zza(r9)
            goto L_0x0032
        L_0x0024:
            com.google.android.gms.internal.ads.zzdpz r13 = r8.zzj     // Catch:{ RemoteException -> 0x002b }
            com.google.android.gms.internal.ads.zzbrp r13 = r13.zzb(r9)     // Catch:{ RemoteException -> 0x002b }
            goto L_0x0032
        L_0x002b:
            r13 = move-exception
            java.lang.String r1 = "Couldn't create RTB adapter : "
            com.google.android.gms.ads.internal.util.zze.zzb(r1, r13)
            r13 = r0
        L_0x0032:
            if (r13 != 0) goto L_0x004c
            com.google.android.gms.internal.ads.zzbcv r8 = com.google.android.gms.internal.ads.zzbde.zzbG
            com.google.android.gms.internal.ads.zzbdc r10 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r8 = r10.zzb(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.zzejx.zzb(r9, r7)
            goto L_0x00bb
        L_0x004b:
            throw r0
        L_0x004c:
            com.google.android.gms.internal.ads.zzejx r6 = new com.google.android.gms.internal.ads.zzejx
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzv.zzD()
            long r4 = r0.elapsedRealtime()
            r0 = r6
            r1 = r9
            r2 = r13
            r3 = r7
            r0.<init>(r1, r2, r3, r4)
            com.google.android.gms.internal.ads.zzbcv r9 = com.google.android.gms.internal.ads.zzbde.zzbL
            com.google.android.gms.internal.ads.zzbdc r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r9 = r0.zzb(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x008e
            java.util.concurrent.ScheduledExecutorService r9 = r8.zze
            java.util.Objects.requireNonNull(r6)
            com.google.android.gms.internal.ads.zzeth r0 = new com.google.android.gms.internal.ads.zzeth
            r0.<init>(r6)
            com.google.android.gms.internal.ads.zzbcv r1 = com.google.android.gms.internal.ads.zzbde.zzbE
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r9.schedule(r0, r1, r3)
        L_0x008e:
            if (r12 == 0) goto L_0x00b8
            com.google.android.gms.internal.ads.zzbcv r9 = com.google.android.gms.internal.ads.zzbde.zzbS
            com.google.android.gms.internal.ads.zzbdc r12 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r9 = r12.zzb(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x00b4
            com.google.android.gms.internal.ads.zzgdy r9 = r8.zzd
            com.google.android.gms.internal.ads.zzete r12 = new com.google.android.gms.internal.ads.zzete
            r0 = r12
            r1 = r8
            r2 = r13
            r3 = r11
            r4 = r10
            r5 = r6
            r6 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r9.zza(r12)
            goto L_0x00bb
        L_0x00b4:
            r8.zzh(r13, r11, r10, r6)
            goto L_0x00bb
        L_0x00b8:
            r6.zzd()
        L_0x00bb:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeti.zzd(com.google.android.gms.internal.ads.zzeti, java.lang.String, java.util.List, android.os.Bundle, boolean, boolean):com.google.common.util.concurrent.ListenableFuture");
    }

    public static /* synthetic */ void zze(zzeti zzeti, zzbrp zzbrp, Bundle bundle, List list, zzejx zzejx, zzcak zzcak) {
        try {
            zzeti.zzh(zzbrp, bundle, list, zzejx);
        } catch (RemoteException e) {
            zzcak.zzd(e);
        }
    }

    private final Bundle zzf(String str) {
        Bundle bundle = this.zzh.zzd.zzm;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final zzgde zzg(String str, List list, Bundle bundle, boolean z, boolean z2) {
        zzetf zzetf = new zzetf(this, str, list, bundle, z, z2);
        zzgdy zzgdy = this.zzd;
        zzgde zzw = zzgde.zzw(zzgdn.zzk(zzetf, zzgdy));
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzbL)).booleanValue()) {
            zzw = (zzgde) zzgdn.zzo(zzw, ((Long) zzbd.zzc().zzb(zzbde.zzbE)).longValue(), TimeUnit.MILLISECONDS, this.zze);
        }
        return (zzgde) zzgdn.zze(zzw, Throwable.class, new zzetg(str), zzgdy);
    }

    private final void zzh(zzbrp zzbrp, Bundle bundle, List list, zzejx zzejx) throws RemoteException {
        zzbrp zzbrp2 = zzbrp;
        zzbrp2.zzh(ObjectWrapper.wrap(this.zzg), this.zza, bundle, (Bundle) list.get(0), this.zzh.zze, zzejx);
    }

    private final void zzi(List list, Map map) {
        for (Map.Entry value : map.entrySet()) {
            zzejy zzejy = (zzejy) value.getValue();
            String str = zzejy.zza;
            list.add(zzg(str, Collections.singletonList(zzejy.zze), zzf(str), zzejy.zzb, zzejy.zzc));
        }
    }

    public final int zza() {
        return 32;
    }

    public final ListenableFuture zzb() {
        if (this.zzl == 2) {
            return zzgdn.zzh(zzc);
        }
        zzfcw zzfcw = this.zzh;
        if (zzfcw.zzr) {
            if (!Arrays.asList(((String) zzbd.zzc().zzb(zzbde.zzbR)).split(",")).contains(zzaa.zzb(zzaa.zzc(zzfcw.zzd)))) {
                return zzgdn.zzh(zzc);
            }
        }
        return zzgdn.zzk(new zzetc(this), this.zzd);
    }
}
