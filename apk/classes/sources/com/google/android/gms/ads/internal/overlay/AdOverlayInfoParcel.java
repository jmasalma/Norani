package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbiv;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbtj;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcfg;
import com.google.android.gms.internal.ads.zzcwl;
import com.google.android.gms.internal.ads.zzded;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzo();
    private static final AtomicLong zzy = new AtomicLong(0);
    /* access modifiers changed from: private */
    public static final ConcurrentHashMap zzz = new ConcurrentHashMap();
    public final zzc zza;
    public final zza zzb;
    public final zzr zzc;
    public final zzcfg zzd;
    public final zzbix zze;
    public final String zzf;
    public final boolean zzg;
    public final String zzh;
    public final zzad zzi;
    public final int zzj;
    public final int zzk;
    public final String zzl;
    public final VersionInfoParcel zzm;
    public final String zzn;
    public final zzl zzo;
    public final zzbiv zzp;
    public final String zzq;
    public final String zzr;
    public final String zzs;
    public final zzcwl zzt;
    public final zzded zzu;
    public final zzbtj zzv;
    public final boolean zzw;
    public final long zzx;

    public AdOverlayInfoParcel(zza zza2, zzr zzr2, zzbiv zzbiv, zzbix zzbix, zzad zzad, zzcfg zzcfg, boolean z, int i, String str, VersionInfoParcel versionInfoParcel, zzded zzded, zzbtj zzbtj, boolean z2) {
        this.zza = null;
        this.zzb = zza2;
        this.zzc = zzr2;
        this.zzd = zzcfg;
        this.zzp = zzbiv;
        this.zze = zzbix;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = zzad;
        this.zzj = i;
        this.zzk = 3;
        this.zzl = str;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzded;
        this.zzv = zzbtj;
        this.zzw = z2;
        this.zzx = zzy.getAndIncrement();
    }

    public static AdOverlayInfoParcel zza(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e) {
            if (!((Boolean) zzbd.zzc().zzb(zzbde.zzno)).booleanValue()) {
                return null;
            }
            zzv.zzp().zzw(e, "AdOverlayInfoParcel.getFromIntent");
            return null;
        }
    }

    private static final IBinder zzc(Object obj) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzno)).booleanValue()) {
            return null;
        }
        return ObjectWrapper.wrap(obj).asBinder();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        int i2 = i;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel2, 2, this.zza, i2, false);
        zza zza2 = this.zzb;
        SafeParcelWriter.writeIBinder(parcel2, 3, zzc(zza2), false);
        zzr zzr2 = this.zzc;
        SafeParcelWriter.writeIBinder(parcel2, 4, zzc(zzr2), false);
        zzcfg zzcfg = this.zzd;
        SafeParcelWriter.writeIBinder(parcel2, 5, zzc(zzcfg), false);
        zzbix zzbix = this.zze;
        SafeParcelWriter.writeIBinder(parcel2, 6, zzc(zzbix), false);
        SafeParcelWriter.writeString(parcel2, 7, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel2, 8, this.zzg);
        SafeParcelWriter.writeString(parcel2, 9, this.zzh, false);
        zzad zzad = this.zzi;
        SafeParcelWriter.writeIBinder(parcel2, 10, zzc(zzad), false);
        SafeParcelWriter.writeInt(parcel2, 11, this.zzj);
        SafeParcelWriter.writeInt(parcel2, 12, this.zzk);
        SafeParcelWriter.writeString(parcel2, 13, this.zzl, false);
        SafeParcelWriter.writeParcelable(parcel2, 14, this.zzm, i2, false);
        SafeParcelWriter.writeString(parcel2, 16, this.zzn, false);
        SafeParcelWriter.writeParcelable(parcel2, 17, this.zzo, i2, false);
        zzbiv zzbiv = this.zzp;
        SafeParcelWriter.writeIBinder(parcel2, 18, zzc(zzbiv), false);
        SafeParcelWriter.writeString(parcel2, 19, this.zzq, false);
        SafeParcelWriter.writeString(parcel2, 24, this.zzr, false);
        SafeParcelWriter.writeString(parcel2, 25, this.zzs, false);
        zzcwl zzcwl = this.zzt;
        SafeParcelWriter.writeIBinder(parcel2, 26, zzc(zzcwl), false);
        zzded zzded = this.zzu;
        SafeParcelWriter.writeIBinder(parcel2, 27, zzc(zzded), false);
        zzbtj zzbtj = this.zzv;
        SafeParcelWriter.writeIBinder(parcel2, 28, zzc(zzbtj), false);
        SafeParcelWriter.writeBoolean(parcel2, 29, this.zzw);
        long j = this.zzx;
        SafeParcelWriter.writeLong(parcel2, 30, j);
        SafeParcelWriter.finishObjectHeader(parcel2, beginObjectHeader);
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzno)).booleanValue()) {
            zzz.put(Long.valueOf(j), new zzp(zza2, zzr2, zzcfg, zzbiv, zzbix, zzad, zzcwl, zzded, zzbtj, zzcaf.zzd.schedule(new zzq(j), (long) ((Integer) zzbd.zzc().zzb(zzbde.zznq)).intValue(), TimeUnit.SECONDS)));
        }
    }

    public AdOverlayInfoParcel(zza zza2, zzr zzr2, zzbiv zzbiv, zzbix zzbix, zzad zzad, zzcfg zzcfg, boolean z, int i, String str, String str2, VersionInfoParcel versionInfoParcel, zzded zzded, zzbtj zzbtj) {
        this.zza = null;
        this.zzb = zza2;
        this.zzc = zzr2;
        this.zzd = zzcfg;
        this.zzp = zzbiv;
        this.zze = zzbix;
        this.zzf = str2;
        this.zzg = z;
        this.zzh = str;
        this.zzi = zzad;
        this.zzj = i;
        this.zzk = 3;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzded;
        this.zzv = zzbtj;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(zza zza2, zzr zzr2, zzad zzad, zzcfg zzcfg, int i, VersionInfoParcel versionInfoParcel, String str, zzl zzl2, String str2, String str3, String str4, zzcwl zzcwl, zzbtj zzbtj, String str5) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzr2;
        this.zzd = zzcfg;
        this.zzp = null;
        this.zze = null;
        this.zzg = false;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzaX)).booleanValue()) {
            this.zzf = null;
            this.zzh = null;
        } else {
            this.zzf = str2;
            this.zzh = str3;
        }
        this.zzi = null;
        this.zzj = i;
        this.zzk = 1;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = str;
        this.zzo = zzl2;
        this.zzq = str5;
        this.zzr = null;
        this.zzs = str4;
        this.zzt = zzcwl;
        this.zzu = null;
        this.zzv = zzbtj;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(zza zza2, zzr zzr2, zzad zzad, zzcfg zzcfg, boolean z, int i, VersionInfoParcel versionInfoParcel, zzded zzded, zzbtj zzbtj) {
        this.zza = null;
        this.zzb = zza2;
        this.zzc = zzr2;
        this.zzd = zzcfg;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = zzad;
        this.zzj = i;
        this.zzk = 2;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzded;
        this.zzv = zzbtj;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    AdOverlayInfoParcel(zzc zzc2, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i, int i2, String str3, VersionInfoParcel versionInfoParcel, String str4, zzl zzl2, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z2, long j) {
        this.zza = zzc2;
        this.zzf = str;
        this.zzg = z;
        this.zzh = str2;
        this.zzj = i;
        this.zzk = i2;
        this.zzl = str3;
        this.zzm = versionInfoParcel;
        this.zzn = str4;
        this.zzo = zzl2;
        this.zzq = str5;
        this.zzr = str6;
        this.zzs = str7;
        this.zzw = z2;
        this.zzx = j;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzno)).booleanValue()) {
            zzp zzp2 = (zzp) zzz.remove(Long.valueOf(j));
            if (zzp2 != null) {
                this.zzb = zzp2.zza;
                this.zzc = zzp2.zzb;
                this.zzd = zzp2.zzc;
                this.zzp = zzp2.zzd;
                this.zze = zzp2.zze;
                this.zzt = zzp2.zzg;
                this.zzu = zzp2.zzh;
                this.zzv = zzp2.zzi;
                this.zzi = zzp2.zzf;
                zzp2.zzj.cancel(false);
                return;
            }
            throw new NullPointerException("AdOverlayObjects is null");
        }
        this.zzb = (zza) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder));
        this.zzc = (zzr) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder2));
        this.zzd = (zzcfg) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder3));
        this.zzp = (zzbiv) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder6));
        this.zze = (zzbix) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder4));
        this.zzi = (zzad) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder5));
        this.zzt = (zzcwl) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder7));
        this.zzu = (zzded) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder8));
        this.zzv = (zzbtj) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder9));
    }

    public AdOverlayInfoParcel(zzc zzc2, zza zza2, zzr zzr2, zzad zzad, VersionInfoParcel versionInfoParcel, zzcfg zzcfg, zzded zzded, String str) {
        this.zza = zzc2;
        this.zzb = zza2;
        this.zzc = zzr2;
        this.zzd = zzcfg;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = zzad;
        this.zzj = -1;
        this.zzk = 4;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzded;
        this.zzv = null;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzr zzr2, zzcfg zzcfg, int i, VersionInfoParcel versionInfoParcel) {
        this.zzc = zzr2;
        this.zzd = zzcfg;
        this.zzj = 1;
        this.zzm = versionInfoParcel;
        this.zza = null;
        this.zzb = null;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzk = 1;
        this.zzl = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = null;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzcfg zzcfg, VersionInfoParcel versionInfoParcel, String str, String str2, int i, zzbtj zzbtj) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzcfg;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = 14;
        this.zzk = 5;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzr = str2;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = zzbtj;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }
}
