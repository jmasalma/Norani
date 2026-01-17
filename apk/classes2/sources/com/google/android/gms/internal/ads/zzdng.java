package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdng extends zzbhi {
    private final Context zza;
    private final zzdit zzb;
    private zzdjt zzc;
    /* access modifiers changed from: private */
    public zzdio zzd;

    public zzdng(Context context, zzdit zzdit, zzdjt zzdjt, zzdio zzdio) {
        this.zza = context;
        this.zzb = zzdit;
        this.zzc = zzdjt;
        this.zzd = zzdio;
    }

    public final zzed zze() {
        return this.zzb.zzj();
    }

    public final zzbgm zzf() throws RemoteException {
        try {
            return this.zzd.zzc().zza();
        } catch (NullPointerException e) {
            zzv.zzp().zzw(e, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    public final zzbgp zzg(String str) {
        return (zzbgp) this.zzb.zzh().get(str);
    }

    public final IObjectWrapper zzh() {
        return ObjectWrapper.wrap(this.zza);
    }

    public final String zzi() {
        return this.zzb.zzA();
    }

    public final String zzj(String str) {
        return (String) this.zzb.zzi().get(str);
    }

    public final List zzk() {
        try {
            zzdit zzdit = this.zzb;
            SimpleArrayMap zzh = zzdit.zzh();
            SimpleArrayMap zzi = zzdit.zzi();
            String[] strArr = new String[(zzh.size() + zzi.size())];
            int i = 0;
            for (int i2 = 0; i2 < zzh.size(); i2++) {
                strArr[i] = (String) zzh.keyAt(i2);
                i++;
            }
            for (int i3 = 0; i3 < zzi.size(); i3++) {
                strArr[i] = (String) zzi.keyAt(i3);
                i++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e) {
            zzv.zzp().zzw(e, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    public final void zzl() {
        zzdio zzdio = this.zzd;
        if (zzdio != null) {
            zzdio.zzb();
        }
        this.zzd = null;
        this.zzc = null;
    }

    public final void zzm() {
        try {
            String zzC = this.zzb.zzC();
            if (Objects.equals(zzC, "Google")) {
                int i = zze.zza;
                zzo.zzj("Illegal argument specified for omid partner name.");
            } else if (TextUtils.isEmpty(zzC)) {
                int i2 = zze.zza;
                zzo.zzj("Not starting OMID session. OM partner name has not been configured.");
            } else {
                zzdio zzdio = this.zzd;
                if (zzdio != null) {
                    zzdio.zzf(zzC, false);
                }
            }
        } catch (NullPointerException e) {
            zzv.zzp().zzw(e, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    public final void zzn(String str) {
        zzdio zzdio = this.zzd;
        if (zzdio != null) {
            zzdio.zzG(str);
        }
    }

    public final void zzo() {
        zzdio zzdio = this.zzd;
        if (zzdio != null) {
            zzdio.zzK();
        }
    }

    public final void zzp(IObjectWrapper iObjectWrapper) {
        zzdio zzdio;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if ((unwrap instanceof View) && this.zzb.zzu() != null && (zzdio = this.zzd) != null) {
            zzdio.zzL((View) unwrap);
        }
    }

    public final boolean zzq() {
        zzdio zzdio = this.zzd;
        if (zzdio != null && !zzdio.zzY()) {
            return false;
        }
        zzdit zzdit = this.zzb;
        if (zzdit.zzr() != null && zzdit.zzs() == null) {
            return true;
        }
        return false;
    }

    public final boolean zzr(IObjectWrapper iObjectWrapper) {
        zzdjt zzdjt;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof ViewGroup) || (zzdjt = this.zzc) == null || !zzdjt.zzf((ViewGroup) unwrap)) {
            return false;
        }
        this.zzb.zzq().zzar(new zzdnf(this, "_videoMediaView"));
        return true;
    }

    public final boolean zzs(IObjectWrapper iObjectWrapper) {
        zzdjt zzdjt;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof ViewGroup) || (zzdjt = this.zzc) == null || !zzdjt.zzg((ViewGroup) unwrap)) {
            return false;
        }
        this.zzb.zzs().zzar(new zzdnf(this, "_videoMediaView"));
        return true;
    }

    public final boolean zzt() {
        zzdit zzdit = this.zzb;
        zzedh zzu = zzdit.zzu();
        if (zzu != null) {
            zzv.zzC().zzk(zzu.zza());
            if (zzdit.zzr() == null) {
                return true;
            }
            zzdit.zzr().zzd("onSdkLoaded", new ArrayMap());
            return true;
        }
        int i = zze.zza;
        zzo.zzj("Trying to start OMID session before creation.");
        return false;
    }
}
