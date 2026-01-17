package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zzck;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzdb;
import com.google.android.gms.ads.internal.client.zzdw;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzag;
import com.google.android.gms.ads.internal.overlay.zzai;
import com.google.android.gms.ads.internal.overlay.zzaj;
import com.google.android.gms.ads.internal.overlay.zzv;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbgt;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzble;
import com.google.android.gms.internal.ads.zzblh;
import com.google.android.gms.internal.ads.zzbpq;
import com.google.android.gms.internal.ads.zzbtj;
import com.google.android.gms.internal.ads.zzbtq;
import com.google.android.gms.internal.ads.zzbwf;
import com.google.android.gms.internal.ads.zzbwv;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzche;
import com.google.android.gms.internal.ads.zzdjn;
import com.google.android.gms.internal.ads.zzdjp;
import com.google.android.gms.internal.ads.zzdtt;
import com.google.android.gms.internal.ads.zzekb;
import com.google.android.gms.internal.ads.zzexa;
import com.google.android.gms.internal.ads.zzeyo;
import com.google.android.gms.internal.ads.zzfaf;
import com.google.android.gms.internal.ads.zzfbt;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public class ClientApi extends zzcq {
    public final zzbt zzb(IObjectWrapper iObjectWrapper, String str, zzbpq zzbpq, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzekb(zzche.zza(context, zzbpq, i), context, str);
    }

    public final zzbx zzc(IObjectWrapper iObjectWrapper, zzr zzr, String str, zzbpq zzbpq, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzexa zzs = zzche.zza(context, zzbpq, i).zzs();
        zzs.zza(str);
        zzs.zzb(context);
        return zzs.zzc().zza();
    }

    public final zzbx zzd(IObjectWrapper iObjectWrapper, zzr zzr, String str, zzbpq zzbpq, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzeyo zzt = zzche.zza(context, zzbpq, i).zzt();
        zzt.zzc(context);
        zzt.zza(zzr);
        zzt.zzb(str);
        return zzt.zzd().zza();
    }

    public final zzbx zze(IObjectWrapper iObjectWrapper, zzr zzr, String str, zzbpq zzbpq, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfaf zzu = zzche.zza(context, zzbpq, i).zzu();
        zzu.zzc(context);
        zzu.zza(zzr);
        zzu.zzb(str);
        return zzu.zzd().zza();
    }

    public final zzbx zzf(IObjectWrapper iObjectWrapper, zzr zzr, String str, int i) {
        return new zzu((Context) ObjectWrapper.unwrap(iObjectWrapper), zzr, str, new VersionInfoParcel(ModuleDescriptor.MODULE_VERSION, i, true, false));
    }

    public final zzck zzg(IObjectWrapper iObjectWrapper, zzbpq zzbpq, int i) {
        return zzche.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbpq, i).zzz();
    }

    public final zzdb zzh(IObjectWrapper iObjectWrapper, int i) {
        return zzche.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), (zzbpq) null, i).zzb();
    }

    public final zzdw zzi(IObjectWrapper iObjectWrapper, zzbpq zzbpq, int i) {
        return zzche.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbpq, i).zzl();
    }

    public final zzbgt zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzdjp((FrameLayout) ObjectWrapper.unwrap(iObjectWrapper), (FrameLayout) ObjectWrapper.unwrap(iObjectWrapper2), ModuleDescriptor.MODULE_VERSION);
    }

    public final zzbgz zzk(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzdjn((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    public final zzblh zzl(IObjectWrapper iObjectWrapper, zzbpq zzbpq, int i, zzble zzble) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzdtt zzj = zzche.zza(context, zzbpq, i).zzj();
        zzj.zzb(context);
        zzj.zza(zzble);
        return zzj.zzc().zzd();
    }

    public final zzbtj zzm(IObjectWrapper iObjectWrapper, zzbpq zzbpq, int i) {
        return zzche.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbpq, i).zzm();
    }

    public final zzbtq zzn(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        AdOverlayInfoParcel zza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (zza == null) {
            return new zzw(activity);
        }
        int i = zza.zzk;
        if (i == 1) {
            return new zzv(activity);
        }
        if (i == 2) {
            return new zzai(activity);
        }
        if (i == 3) {
            return new zzaj(activity);
        }
        if (i != 4) {
            return i != 5 ? new zzw(activity) : new zzag(activity);
        }
        return new zzac(activity, zza);
    }

    public final zzbwf zzo(IObjectWrapper iObjectWrapper, zzbpq zzbpq, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfbt zzv = zzche.zza(context, zzbpq, i).zzv();
        zzv.zzb(context);
        return zzv.zzc().zzb();
    }

    public final zzbwv zzp(IObjectWrapper iObjectWrapper, String str, zzbpq zzbpq, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfbt zzv = zzche.zza(context, zzbpq, i).zzv();
        zzv.zzb(context);
        zzv.zza(str);
        return zzv.zzc().zza();
    }

    public final zzbza zzq(IObjectWrapper iObjectWrapper, zzbpq zzbpq, int i) {
        return zzche.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbpq, i).zzp();
    }
}
