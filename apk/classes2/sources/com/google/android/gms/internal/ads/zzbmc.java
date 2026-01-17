package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbmc implements zzapw {
    /* access modifiers changed from: private */
    public volatile zzblp zza;
    private final Context zzb;

    public zzbmc(Context context) {
        this.zzb = context;
    }

    static /* bridge */ /* synthetic */ void zzc(zzbmc zzbmc) {
        if (zzbmc.zza != null) {
            zzbmc.zza.disconnect();
            Binder.flushPendingCommands();
        }
    }

    public final zzapz zza(zzaqd zzaqd) throws zzaqm {
        Parcelable.Creator<zzblq> creator = zzblq.CREATOR;
        Map zzl = zzaqd.zzl();
        int size = zzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Map.Entry entry : zzl.entrySet()) {
            strArr[i] = (String) entry.getKey();
            strArr2[i] = (String) entry.getValue();
            i++;
        }
        zzblq zzblq = new zzblq(zzaqd.zzk(), strArr, strArr2);
        long elapsedRealtime = zzv.zzD().elapsedRealtime();
        try {
            zzcak zzcak = new zzcak();
            this.zza = new zzblp(this.zzb, zzv.zzv().zzb(), new zzbma(this, zzcak), new zzbmb(this, zzcak));
            this.zza.checkAvailabilityAndConnect();
            zzbly zzbly = new zzbly(this, zzblq);
            zzgdy zzgdy = zzcaf.zza;
            ListenableFuture zzo = zzgdn.zzo(zzgdn.zzn(zzcak, zzbly, zzgdy), (long) ((Integer) zzbd.zzc().zzb(zzbde.zzeL)).intValue(), TimeUnit.MILLISECONDS, zzcaf.zzd);
            zzo.addListener(new zzblz(this), zzgdy);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzo.get();
            zze.zza("Http assets remote cache took " + (zzv.zzD().elapsedRealtime() - elapsedRealtime) + "ms");
            zzbls zza2 = new zzbvo(parcelFileDescriptor).zza(zzbls.CREATOR);
            if (zza2 == null) {
                return null;
            }
            if (!zza2.zza) {
                String[] strArr3 = zza2.zze;
                String[] strArr4 = zza2.zzf;
                if (strArr3.length != strArr4.length) {
                    return null;
                }
                HashMap hashMap = new HashMap();
                for (int i2 = 0; i2 < strArr3.length; i2++) {
                    hashMap.put(strArr3[i2], strArr4[i2]);
                }
                return new zzapz(zza2.zzc, zza2.zzd, (Map) hashMap, zza2.zzg, zza2.zzh);
            }
            throw new zzaqm(zza2.zzb);
        } catch (InterruptedException | ExecutionException unused) {
            zze.zza("Http assets remote cache took " + (zzv.zzD().elapsedRealtime() - elapsedRealtime) + "ms");
            return null;
        } catch (Throwable th) {
            zze.zza("Http assets remote cache took " + (zzv.zzD().elapsedRealtime() - elapsedRealtime) + "ms");
            throw th;
        }
    }
}
