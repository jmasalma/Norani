package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbex;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzfhj;
import com.google.android.gms.internal.ads.zzfhu;
import com.google.android.gms.internal.ads.zzgdj;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzaq implements zzgdj {
    final /* synthetic */ ListenableFuture zza;
    final /* synthetic */ zzbze zzb;
    final /* synthetic */ zzbyx zzc;
    final /* synthetic */ zzfhj zzd;
    final /* synthetic */ zzau zze;

    zzaq(zzau zzau, ListenableFuture listenableFuture, zzbze zzbze, zzbyx zzbyx, zzfhj zzfhj) {
        this.zza = listenableFuture;
        this.zzb = zzbze;
        this.zzc = zzbyx;
        this.zzd = zzfhj;
        Objects.requireNonNull(zzau);
        this.zze = zzau;
    }

    public final void zza(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzia)).booleanValue()) {
            zzv.zzp().zzv(th, "SignalGeneratorImpl.generateSignals");
        } else {
            zzv.zzp().zzw(th, "SignalGeneratorImpl.generateSignals");
        }
        zzfhu zzs = zzau.zzs(this.zza, this.zzb);
        if (((Boolean) zzbex.zze.zze()).booleanValue() && zzs != null) {
            zzfhj zzfhj = this.zzd;
            zzfhj.zzh(th);
            zzfhj.zzg(false);
            zzs.zza(zzfhj);
            zzs.zzh();
        }
        zzbyx zzbyx = this.zzc;
        if (zzbyx != null) {
            try {
                if (!"Unknown format is no longer supported.".equals(message)) {
                    message = "Internal error. " + message;
                }
                zzbyx.zzb(message);
            } catch (RemoteException e) {
                int i = zze.zza;
                zzo.zzh("", e);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        JSONObject jSONObject;
        zzbk zzbk = (zzbk) obj;
        zzfhu zzs = zzau.zzs(this.zza, this.zzb);
        this.zze.zzG.set(true);
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzhU)).booleanValue()) {
            try {
                zzbyx zzbyx = this.zzc;
                if (zzbyx != null) {
                    zzbyx.zzb("QueryInfo generation has been disabled.");
                }
            } catch (RemoteException e) {
                String concat = "QueryInfo generation has been disabled.".concat(e.toString());
                int i = zze.zza;
                zzo.zzg(concat);
            }
            if (((Boolean) zzbex.zze.zze()).booleanValue() && zzs != null) {
                zzfhj zzfhj = this.zzd;
                zzfhj.zzc("QueryInfo generation has been disabled.");
                zzfhj.zzg(false);
                zzs.zza(zzfhj);
                zzs.zzh();
            }
        } else if (zzbk == null) {
            try {
                zzbyx zzbyx2 = this.zzc;
                if (zzbyx2 != null) {
                    zzbyx2.zzc((String) null, (String) null, (Bundle) null);
                }
                zzfhj zzfhj2 = this.zzd;
                zzfhj2.zzg(true);
                if (((Boolean) zzbex.zze.zze()).booleanValue() && zzs != null) {
                    zzs.zza(zzfhj2);
                    zzs.zzh();
                }
            } catch (RemoteException e2) {
                zzfhj zzfhj3 = this.zzd;
                zzfhj3.zzh(e2);
                zzfhj3.zzg(false);
                int i2 = zze.zza;
                zzo.zzh("", e2);
                zzv.zzp().zzw(e2, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (((Boolean) zzbex.zze.zze()).booleanValue() && zzs != null) {
                    zzs.zza(this.zzd);
                    zzs.zzh();
                }
            } catch (Throwable th) {
                if (((Boolean) zzbex.zze.zze()).booleanValue() && zzs != null) {
                    zzs.zza(this.zzd);
                    zzs.zzh();
                }
                throw th;
            }
        } else {
            try {
                if (!TextUtils.isEmpty(zzbk.zzc)) {
                    jSONObject = new JSONObject(zzbk.zzc);
                } else {
                    jSONObject = new JSONObject(zzbk.zzb);
                }
                if (TextUtils.isEmpty(jSONObject.optString("request_id", ""))) {
                    int i3 = zze.zza;
                    zzo.zzj("The request ID is empty in request JSON.");
                    zzbyx zzbyx3 = this.zzc;
                    if (zzbyx3 != null) {
                        zzbyx3.zzb("Internal error: request ID is empty in request JSON.");
                    }
                    zzfhj zzfhj4 = this.zzd;
                    zzfhj4.zzc("Request ID empty");
                    zzfhj4.zzg(false);
                    if (((Boolean) zzbex.zze.zze()).booleanValue() && zzs != null) {
                        zzs.zza(zzfhj4);
                        zzs.zzh();
                        return;
                    }
                    return;
                }
                Bundle bundle = zzbk.zzf;
                zzau zzau = this.zze;
                if (zzau.zzu && bundle != null && bundle.getInt(zzau.zzw, -1) == -1) {
                    bundle.putInt(zzau.zzw, zzau.zzx.get());
                }
                if (zzau.zzt && bundle != null && TextUtils.isEmpty(bundle.getString(zzau.zzv))) {
                    if (TextUtils.isEmpty(zzau.zzz)) {
                        zzau.zzz = zzv.zzr().zzc(zzau.zzg, zzau.zzy.afmaVersion);
                    }
                    bundle.putString(zzau.zzv, zzau.zzz);
                }
                zzbyx zzbyx4 = this.zzc;
                if (zzbyx4 != null) {
                    if (!TextUtils.isEmpty(zzbk.zzc)) {
                        zzbyx4.zzc(zzbk.zza, zzbk.zzc, bundle);
                    } else {
                        zzbyx4.zzc(zzbk.zza, zzbk.zzb, bundle);
                    }
                }
                this.zzd.zzg(true);
                if (((Boolean) zzbex.zze.zze()).booleanValue() && zzs != null) {
                    zzs.zza(this.zzd);
                    zzs.zzh();
                }
            } catch (JSONException e3) {
                int i4 = zze.zza;
                zzo.zzj("Failed to create JSON object from the request string.");
                zzbyx zzbyx5 = this.zzc;
                if (zzbyx5 != null) {
                    String obj2 = e3.toString();
                    zzbyx5.zzb("Internal error for request JSON: " + obj2);
                }
                zzfhj zzfhj5 = this.zzd;
                zzfhj5.zzh(e3);
                zzfhj5.zzg(false);
                zzv.zzp().zzw(e3, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (((Boolean) zzbex.zze.zze()).booleanValue() && zzs != null) {
                    zzs.zza(zzfhj5);
                    zzs.zzh();
                }
            }
        }
    }
}
