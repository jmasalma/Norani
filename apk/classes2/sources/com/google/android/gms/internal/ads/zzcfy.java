package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.Predicate;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcfy extends FrameLayout implements zzcfg {
    private final zzcfg zza;
    private final zzcbq zzb;
    private final AtomicBoolean zzc = new AtomicBoolean();

    public zzcfy(zzcfg zzcfg, zzdsj zzdsj) {
        super(zzcfg.getContext());
        this.zza = zzcfg;
        this.zzb = new zzcbq(zzcfg.zzE(), this, this, zzdsj);
        addView((View) zzcfg);
    }

    public static /* synthetic */ void zzaI(zzcfy zzcfy, boolean z) {
        zzcfg zzcfg = zzcfy.zza;
        zzfrw zzfrw = zzs.zza;
        Objects.requireNonNull(zzcfg);
        zzfrw.post(new zzcfu(zzcfg));
    }

    public final boolean canGoBack() {
        return this.zza.canGoBack();
    }

    public final void destroy() {
        zzedf zzP;
        zzedh zzQ = zzQ();
        if (zzQ != null) {
            zzfrw zzfrw = zzs.zza;
            zzfrw.post(new zzcfv(zzQ));
            zzcfg zzcfg = this.zza;
            Objects.requireNonNull(zzcfg);
            zzfrw.postDelayed(new zzcfu(zzcfg), (long) ((Integer) zzbd.zzc().zzb(zzbde.zzfA)).intValue());
            return;
        }
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzfC)).booleanValue() || (zzP = zzP()) == null) {
            this.zza.destroy();
        } else {
            zzs.zza.post(new zzcfw(this, zzP));
        }
    }

    public final void goBack() {
        this.zza.goBack();
    }

    public final void loadData(String str, String str2, String str3) {
        this.zza.loadData(str, "text/html", str3);
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.zza.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", (String) null);
    }

    public final void loadUrl(String str) {
        this.zza.loadUrl(str);
    }

    public final void onAdClicked() {
        zzcfg zzcfg = this.zza;
        if (zzcfg != null) {
            zzcfg.onAdClicked();
        }
    }

    public final void onPause() {
        this.zzb.zzf();
        this.zza.onPause();
    }

    public final void onResume() {
        this.zza.onResume();
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zza.setOnClickListener(onClickListener);
    }

    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zza.setOnTouchListener(onTouchListener);
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zza.setWebChromeClient(webChromeClient);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zza.setWebViewClient(webViewClient);
    }

    public final void zzA(int i) {
        this.zza.zzA(i);
    }

    public final void zzB(int i) {
        this.zzb.zzg(i);
    }

    public final void zzC(zzcgi zzcgi) {
        this.zza.zzC(zzcgi);
    }

    public final zzfca zzD() {
        return this.zza.zzD();
    }

    public final Context zzE() {
        return this.zza.zzE();
    }

    public final View zzF() {
        return this;
    }

    public final WebView zzG() {
        return (WebView) this.zza;
    }

    public final WebViewClient zzH() {
        return this.zza.zzH();
    }

    public final zzavu zzI() {
        return this.zza.zzI();
    }

    public final zzbaq zzJ() {
        return this.zza.zzJ();
    }

    public final zzbgd zzK() {
        return this.zza.zzK();
    }

    public final zzm zzL() {
        return this.zza.zzL();
    }

    public final zzm zzM() {
        return this.zza.zzM();
    }

    public final zzcgy zzN() {
        return ((zzcgf) this.zza).zzaO();
    }

    public final zzchd zzO() {
        return this.zza.zzO();
    }

    public final zzedf zzP() {
        return this.zza.zzP();
    }

    public final zzedh zzQ() {
        return this.zza.zzQ();
    }

    public final zzfcd zzR() {
        return this.zza.zzR();
    }

    public final zzfda zzS() {
        return this.zza.zzS();
    }

    public final ListenableFuture zzT() {
        return this.zza.zzT();
    }

    public final String zzU() {
        return this.zza.zzU();
    }

    public final List zzV() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != this.zza) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    public final void zzW(zzfca zzfca, zzfcd zzfcd) {
        this.zza.zzW(zzfca, zzfcd);
    }

    public final void zzX() {
        this.zzb.zze();
        this.zza.zzX();
    }

    public final void zzY() {
        this.zza.zzY();
    }

    public final void zzZ(int i) {
        this.zza.zzZ(i);
    }

    public final void zza(String str) {
        ((zzcgf) this.zza).zzaW(str);
    }

    public final void zzaA(String str, Predicate predicate) {
        this.zza.zzaA(str, predicate);
    }

    public final boolean zzaB() {
        return this.zza.zzaB();
    }

    public final boolean zzaC() {
        return this.zza.zzaC();
    }

    public final boolean zzaD(boolean z, int i) {
        if (!this.zzc.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzba)).booleanValue()) {
            return false;
        }
        zzcfg zzcfg = this.zza;
        if (zzcfg.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzcfg.getParent()).removeView((View) zzcfg);
        }
        zzcfg.zzaD(z, i);
        return true;
    }

    public final boolean zzaE() {
        return this.zza.zzaE();
    }

    public final boolean zzaF() {
        return this.zza.zzaF();
    }

    public final boolean zzaG() {
        return this.zzc.get();
    }

    public final boolean zzaH() {
        return this.zza.zzaH();
    }

    public final void zzaJ(zzc zzc2, boolean z, boolean z2, String str) {
        this.zza.zzaJ(zzc2, z, z2, str);
    }

    public final void zzaK(String str, String str2, int i) {
        this.zza.zzaK(str, str2, 14);
    }

    public final void zzaL(boolean z, int i, boolean z2) {
        this.zza.zzaL(z, i, z2);
    }

    public final void zzaM(boolean z, int i, String str, String str2, boolean z2) {
        this.zza.zzaM(z, i, str, str2, z2);
    }

    public final void zzaN(boolean z, int i, String str, boolean z2, boolean z3) {
        this.zza.zzaN(z, i, str, z2, z3);
    }

    public final void zzaa() {
        this.zza.zzaa();
    }

    public final void zzab() {
        this.zza.zzab();
    }

    public final void zzac(boolean z) {
        this.zza.zzac(z);
    }

    public final void zzad() {
        this.zza.zzad();
    }

    public final void zzae(String str, String str2, String str3) {
        this.zza.zzae(str, str2, (String) null);
    }

    public final void zzaf() {
        this.zza.zzaf();
    }

    public final void zzag(String str, zzbkf zzbkf) {
        this.zza.zzag(str, zzbkf);
    }

    public final void zzah() {
        zzedh zzQ;
        zzedf zzP;
        TextView textView = new TextView(getContext());
        zzv.zzr();
        textView.setText(zzs.zzz());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzfC)).booleanValue() || (zzP = zzP()) == null) {
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzfB)).booleanValue() && (zzQ = zzQ()) != null && zzQ.zzb()) {
                zzv.zzC().zzg(zzQ.zza(), textView);
                return;
            }
            return;
        }
        zzP.zza(textView);
    }

    public final void zzai(zzm zzm) {
        this.zza.zzai(zzm);
    }

    public final void zzaj(zzchd zzchd) {
        this.zza.zzaj(zzchd);
    }

    public final void zzak(zzbaq zzbaq) {
        this.zza.zzak(zzbaq);
    }

    public final void zzal(boolean z) {
        this.zza.zzal(z);
    }

    public final void zzam() {
        setBackgroundColor(0);
        this.zza.setBackgroundColor(0);
    }

    public final void zzan(Context context) {
        this.zza.zzan(context);
    }

    public final void zzao(boolean z) {
        this.zza.zzao(z);
    }

    public final void zzap(zzbgb zzbgb) {
        this.zza.zzap(zzbgb);
    }

    public final void zzaq(boolean z) {
        this.zza.zzaq(z);
    }

    public final void zzar(zzbgd zzbgd) {
        this.zza.zzar(zzbgd);
    }

    public final void zzas(zzedf zzedf) {
        this.zza.zzas(zzedf);
    }

    public final void zzat(zzedh zzedh) {
        this.zza.zzat(zzedh);
    }

    public final void zzau(int i) {
        this.zza.zzau(i);
    }

    public final void zzav(boolean z) {
        this.zza.zzav(true);
    }

    public final void zzaw(zzm zzm) {
        this.zza.zzaw(zzm);
    }

    public final void zzax(boolean z) {
        this.zza.zzax(z);
    }

    public final void zzay(boolean z) {
        this.zza.zzay(z);
    }

    public final void zzaz(String str, zzbkf zzbkf) {
        this.zza.zzaz(str, zzbkf);
    }

    public final void zzb(String str, String str2) {
        this.zza.zzb("window.inspectorInfo", str2);
    }

    public final void zzd(String str, Map map) {
        this.zza.zzd(str, map);
    }

    public final void zzdH() {
        zzcfg zzcfg = this.zza;
        if (zzcfg != null) {
            zzcfg.zzdH();
        }
    }

    public final void zzdf() {
        zzcfg zzcfg = this.zza;
        if (zzcfg != null) {
            zzcfg.zzdf();
        }
    }

    public final void zzdg() {
        this.zza.zzdg();
    }

    public final void zzdh() {
        this.zza.zzdh();
    }

    public final void zzdi() {
        this.zza.zzdi();
    }

    public final void zzdr(zzazc zzazc) {
        this.zza.zzdr(zzazc);
    }

    public final void zze(String str, JSONObject jSONObject) {
        this.zza.zze(str, jSONObject);
    }

    public final int zzf() {
        return this.zza.zzf();
    }

    public final int zzg() {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzeg)).booleanValue()) {
            return this.zza.getMeasuredHeight();
        }
        return getMeasuredHeight();
    }

    public final int zzh() {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzeg)).booleanValue()) {
            return this.zza.getMeasuredWidth();
        }
        return getMeasuredWidth();
    }

    public final Activity zzi() {
        return this.zza.zzi();
    }

    public final zza zzj() {
        return this.zza.zzj();
    }

    public final zzbdq zzk() {
        return this.zza.zzk();
    }

    public final zzbdr zzl() {
        return this.zza.zzl();
    }

    public final VersionInfoParcel zzm() {
        return this.zza.zzm();
    }

    public final zzcbq zzn() {
        return this.zzb;
    }

    public final zzcdn zzo(String str) {
        return this.zza.zzo(str);
    }

    public final void zzp(String str, JSONObject jSONObject) {
        ((zzcgf) this.zza).zzb(str, jSONObject.toString());
    }

    public final zzcgi zzq() {
        return this.zza.zzq();
    }

    public final String zzr() {
        return this.zza.zzr();
    }

    public final String zzs() {
        return this.zza.zzs();
    }

    public final void zzt(String str, zzcdn zzcdn) {
        this.zza.zzt(str, zzcdn);
    }

    public final void zzv(boolean z, long j) {
        this.zza.zzv(z, j);
    }

    public final void zzw() {
        this.zza.zzw();
    }

    public final void zzx(int i) {
    }

    public final void zzy(int i) {
    }

    public final void zzz(boolean z) {
        this.zza.zzz(false);
    }
}
