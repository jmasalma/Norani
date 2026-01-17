package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzbw;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcv;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.ads.internal.client.zzgc;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzavu;
import com.google.android.gms.internal.ads.zzavv;
import com.google.android.gms.internal.ads.zzbaz;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzbeq;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzbuc;
import com.google.android.gms.internal.ads.zzbwi;
import com.google.android.gms.internal.ads.zzcaf;
import java.util.Map;
import java.util.concurrent.Future;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzu extends zzbw {
    /* access modifiers changed from: private */
    public final VersionInfoParcel zza;
    private final zzr zzb;
    /* access modifiers changed from: private */
    public final Future zzc = zzcaf.zza.zzb(new zzq(this));
    /* access modifiers changed from: private */
    public final Context zzd;
    private final zzs zze;
    /* access modifiers changed from: private */
    public WebView zzf;
    /* access modifiers changed from: private */
    public zzbk zzg;
    /* access modifiers changed from: private */
    public zzavu zzh;
    private AsyncTask zzi;

    public zzu(Context context, zzr zzr, String str, VersionInfoParcel versionInfoParcel) {
        this.zzd = context;
        this.zza = versionInfoParcel;
        this.zzb = zzr;
        this.zzf = new WebView(context);
        this.zze = new zzs(context, str);
        zzX(0);
        this.zzf.setVerticalScrollBarEnabled(false);
        this.zzf.getSettings().setJavaScriptEnabled(true);
        this.zzf.setWebViewClient(new zzo(this));
        this.zzf.setOnTouchListener(new zzp(this));
    }

    static /* bridge */ /* synthetic */ String zzp(zzu zzu, String str) {
        if (zzu.zzh == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = zzu.zzh.zza(parse, zzu.zzd, (View) null, (Activity) null);
        } catch (zzavv e) {
            int i = zze.zza;
            zzo.zzk("Unable to process ad data", e);
        }
        return parse.toString();
    }

    static /* bridge */ /* synthetic */ void zzx(zzu zzu, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        zzu.zzd.startActivity(intent);
    }

    public final void zzA() throws RemoteException {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }

    public final void zzB() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zzC() throws RemoteException {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    public final void zzD(zzbh zzbh) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zzE(zzbk zzbk) throws RemoteException {
        this.zzg = zzbk;
    }

    public final void zzF(zzcb zzcb) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzG(zzr zzr) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    public final void zzH(zzco zzco) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zzI(zzbaz zzbaz) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zzJ(zzx zzx) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzK(zzcv zzcv) {
    }

    public final void zzL(zzeh zzeh) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzM(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzN(zzbtz zzbtz) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zzO(boolean z) throws RemoteException {
    }

    public final void zzP(zzbdz zzbdz) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zzQ(zzdt zzdt) {
    }

    public final void zzR(long j) {
    }

    public final void zzS(zzbuc zzbuc, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zzT(String str) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzU(zzbwi zzbwi) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zzV(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final void zzW(zzgc zzgc) {
        throw new IllegalStateException("Unused method");
    }

    /* access modifiers changed from: package-private */
    public final void zzX(int i) {
        if (this.zzf != null) {
            this.zzf.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
        }
    }

    public final void zzY(IObjectWrapper iObjectWrapper) {
    }

    public final void zzZ() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public final boolean zzaa() throws RemoteException {
        return false;
    }

    public final boolean zzab() throws RemoteException {
        return false;
    }

    public final boolean zzac() throws RemoteException {
        return false;
    }

    public final boolean zzad(zzm zzm) throws RemoteException {
        Preconditions.checkNotNull(this.zzf, "This Search Ad has already been torn down");
        this.zze.zzf(zzm, this.zza);
        this.zzi = new zzr(this, (zzt) null).execute(new Void[0]);
        return true;
    }

    public final void zzae(zzcs zzcs) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* access modifiers changed from: package-private */
    public final int zzb(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            zzbb.zzb();
            return zzf.zzC(this.zzd, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final long zzc() {
        return 0;
    }

    public final Bundle zze() {
        throw new IllegalStateException("Unused method");
    }

    public final zzr zzh() throws RemoteException {
        return this.zzb;
    }

    public final zzbk zzj() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    public final zzco zzk() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    public final zzea zzl() {
        return null;
    }

    public final zzed zzm() {
        return null;
    }

    public final IObjectWrapper zzo() throws RemoteException {
        Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        return ObjectWrapper.wrap(this.zzf);
    }

    /* access modifiers changed from: package-private */
    public final String zzq() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) zzbeq.zzd.zze());
        zzs zzs = this.zze;
        builder.appendQueryParameter(SearchIntents.EXTRA_QUERY, zzs.zzd());
        builder.appendQueryParameter("pubId", zzs.zzc());
        builder.appendQueryParameter("mappver", zzs.zza());
        Map zze2 = zzs.zze();
        for (String str : zze2.keySet()) {
            builder.appendQueryParameter(str, (String) zze2.get(str));
        }
        Uri build = builder.build();
        zzavu zzavu = this.zzh;
        if (zzavu != null) {
            try {
                build = zzavu.zzb(build, this.zzd);
            } catch (zzavv e) {
                int i = zze.zza;
                zzo.zzk("Unable to process ad data", e);
            }
        }
        String zzr = zzr();
        String encodedQuery = build.getEncodedQuery();
        return zzr + "#" + encodedQuery;
    }

    /* access modifiers changed from: package-private */
    public final String zzr() {
        String zzb2 = this.zze.zzb();
        if (true == TextUtils.isEmpty(zzb2)) {
            zzb2 = "www.google.com";
        }
        return "https://" + zzb2 + ((String) zzbeq.zzd.zze());
    }

    public final String zzs() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    public final String zzt() throws RemoteException {
        return null;
    }

    public final String zzu() throws RemoteException {
        return null;
    }

    public final void zzy() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzi.cancel(true);
        this.zzc.cancel(false);
        this.zzf.destroy();
        this.zzf = null;
    }

    public final void zzz(zzm zzm, zzbn zzbn) {
    }
}
