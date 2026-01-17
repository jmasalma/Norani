package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.zzc;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeer implements zzeds {
    private final Context zza;
    private final zzcpx zzb;
    private final Executor zzc;

    public zzeer(Context context, zzcpx zzcpx, Executor executor) {
        this.zza = context;
        this.zzb = zzcpx;
        this.zzc = executor;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object zza(com.google.android.gms.internal.ads.zzfcn r8, com.google.android.gms.internal.ads.zzfca r9, com.google.android.gms.internal.ads.zzedp r10) throws com.google.android.gms.internal.ads.zzfdd, com.google.android.gms.internal.ads.zzehf {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzij
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x0079
            boolean r0 = r9.zzag
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r10.zzb
            com.google.android.gms.internal.ads.zzfdu r0 = (com.google.android.gms.internal.ads.zzfdu) r0
            com.google.android.gms.internal.ads.zzbpz r0 = r0.zzc()
            if (r0 == 0) goto L_0x0067
            com.google.android.gms.dynamic.IObjectWrapper r2 = r0.zze()     // Catch:{ RemoteException -> 0x0060 }
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)     // Catch:{ RemoteException -> 0x0060 }
            android.view.View r2 = (android.view.View) r2     // Catch:{ RemoteException -> 0x0060 }
            boolean r0 = r0.zzf()     // Catch:{ RemoteException -> 0x0060 }
            if (r2 == 0) goto L_0x0053
            if (r0 == 0) goto L_0x0081
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgdn.zzh(r1)
            com.google.android.gms.internal.ads.zzeep r3 = new com.google.android.gms.internal.ads.zzeep
            r3.<init>(r7, r2, r9)
            com.google.android.gms.internal.ads.zzgdy r2 = com.google.android.gms.internal.ads.zzcaf.zzf
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgdn.zzn(r0, r3, r2)
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException -> 0x004c, ExecutionException -> 0x004a }
            r2 = r0
            android.view.View r2 = (android.view.View) r2     // Catch:{ InterruptedException -> 0x004c, ExecutionException -> 0x004a }
            goto L_0x0081
        L_0x004a:
            r8 = move-exception
            goto L_0x004d
        L_0x004c:
            r8 = move-exception
        L_0x004d:
            com.google.android.gms.internal.ads.zzfdd r9 = new com.google.android.gms.internal.ads.zzfdd
            r9.<init>(r8)
            throw r9
        L_0x0053:
            com.google.android.gms.internal.ads.zzfdd r8 = new com.google.android.gms.internal.ads.zzfdd
            java.lang.Exception r9 = new java.lang.Exception
            java.lang.String r10 = "BannerAdapterWrapper interscrollerView should not be null"
            r9.<init>(r10)
            r8.<init>(r9)
            throw r8
        L_0x0060:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzfdd r9 = new com.google.android.gms.internal.ads.zzfdd
            r9.<init>(r8)
            throw r9
        L_0x0067:
            int r8 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r8 = "getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."
            com.google.android.gms.ads.internal.util.client.zzo.zzg(r8)
            com.google.android.gms.internal.ads.zzfdd r9 = new com.google.android.gms.internal.ads.zzfdd
            java.lang.Exception r10 = new java.lang.Exception
            r10.<init>(r8)
            r9.<init>(r10)
            throw r9
        L_0x0079:
            java.lang.Object r0 = r10.zzb
            com.google.android.gms.internal.ads.zzfdu r0 = (com.google.android.gms.internal.ads.zzfdu) r0
            android.view.View r2 = r0.zza()
        L_0x0081:
            com.google.android.gms.internal.ads.zzcpx r0 = r7.zzb
            java.lang.String r3 = r10.zza
            com.google.android.gms.internal.ads.zzcrq r4 = new com.google.android.gms.internal.ads.zzcrq
            r4.<init>(r8, r9, r3)
            java.lang.Object r8 = r10.zzb
            com.google.android.gms.internal.ads.zzcoz r3 = new com.google.android.gms.internal.ads.zzcoz
            com.google.android.gms.internal.ads.zzfdu r8 = (com.google.android.gms.internal.ads.zzfdu) r8
            java.util.Objects.requireNonNull(r8)
            com.google.android.gms.internal.ads.zzeeq r5 = new com.google.android.gms.internal.ads.zzeeq
            r5.<init>(r8)
            java.util.List r9 = r9.zzu
            r6 = 0
            java.lang.Object r9 = r9.get(r6)
            com.google.android.gms.internal.ads.zzfcb r9 = (com.google.android.gms.internal.ads.zzfcb) r9
            r3.<init>(r2, r1, r5, r9)
            com.google.android.gms.internal.ads.zzcot r9 = r0.zza(r4, r3)
            com.google.android.gms.internal.ads.zzddx r0 = r9.zzh()
            r0.zza(r2)
            com.google.android.gms.internal.ads.zzcwx r0 = r9.zzd()
            com.google.android.gms.internal.ads.zzcmg r1 = new com.google.android.gms.internal.ads.zzcmg
            r1.<init>(r8)
            java.util.concurrent.Executor r8 = r7.zzc
            r0.zzo(r1, r8)
            com.google.android.gms.internal.ads.zzcxi r8 = r10.zzc
            com.google.android.gms.internal.ads.zzefd r8 = (com.google.android.gms.internal.ads.zzefd) r8
            com.google.android.gms.internal.ads.zzeiv r10 = r9.zzk()
            r8.zzc(r10)
            com.google.android.gms.internal.ads.zzcos r8 = r9.zza()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeer.zza(com.google.android.gms.internal.ads.zzfcn, com.google.android.gms.internal.ads.zzfca, com.google.android.gms.internal.ads.zzedp):java.lang.Object");
    }

    public final void zzb(zzfcn zzfcn, zzfca zzfca, zzedp zzedp) throws zzfdd {
        zzr zza2;
        zzfcw zzfcw = zzfcn.zza.zza;
        zzr zzr = zzfcw.zze;
        if (zzr.zzn) {
            zza2 = new zzr(this.zza, zzc.zzd(zzr.zze, zzr.zzb));
        } else {
            if (!((Boolean) zzbd.zzc().zzb(zzbde.zzij)).booleanValue() || !zzfca.zzag) {
                zza2 = zzfdc.zza(this.zza, zzfca.zzu);
            } else {
                zza2 = new zzr(this.zza, zzc.zze(zzr.zze, zzr.zzb));
            }
        }
        zzr zzr2 = zza2;
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzij)).booleanValue() || !zzfca.zzag) {
            ((zzfdu) zzedp.zzb).zzm(this.zza, zzr2, zzfcw.zzd, zzfca.zzv.toString(), zzbs.zzm(zzfca.zzs), (zzbpw) zzedp.zzc);
            return;
        }
        ((zzfdu) zzedp.zzb).zzn(this.zza, zzr2, zzfcw.zzd, zzfca.zzv.toString(), zzbs.zzm(zzfca.zzs), (zzbpw) zzedp.zzc);
    }
}
