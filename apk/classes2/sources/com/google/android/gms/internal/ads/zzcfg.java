package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzn;
import com.google.android.gms.common.util.Predicate;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public interface zzcfg extends zza, zzded, zzcex, zzbna, zzcgj, zzcgn, zzbnm, zzazd, zzcgq, zzn, zzcgt, zzcgu, zzccb, zzcgv {
    boolean canGoBack();

    void destroy();

    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    boolean isAttachedToWindow();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i, int i2);

    void onPause();

    void onResume();

    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void zzC(zzcgi zzcgi);

    zzfca zzD();

    Context zzE();

    View zzF();

    WebView zzG();

    WebViewClient zzH();

    zzavu zzI();

    zzbaq zzJ();

    zzbgd zzK();

    zzm zzL();

    zzm zzM();

    zzcgy zzN();

    zzchd zzO();

    zzedf zzP();

    zzedh zzQ();

    zzfcd zzR();

    zzfda zzS();

    ListenableFuture zzT();

    String zzU();

    List zzV();

    void zzW(zzfca zzfca, zzfcd zzfcd);

    void zzX();

    void zzY();

    void zzZ(int i);

    void zzaA(String str, Predicate predicate);

    boolean zzaB();

    boolean zzaC();

    boolean zzaD(boolean z, int i);

    boolean zzaE();

    boolean zzaF();

    boolean zzaG();

    boolean zzaH();

    void zzaa();

    void zzab();

    void zzac(boolean z);

    void zzad();

    void zzae(String str, String str2, String str3);

    void zzaf();

    void zzag(String str, zzbkf zzbkf);

    void zzah();

    void zzai(zzm zzm);

    void zzaj(zzchd zzchd);

    void zzak(zzbaq zzbaq);

    void zzal(boolean z);

    void zzam();

    void zzan(Context context);

    void zzao(boolean z);

    void zzap(zzbgb zzbgb);

    void zzaq(boolean z);

    void zzar(zzbgd zzbgd);

    void zzas(zzedf zzedf);

    void zzat(zzedh zzedh);

    void zzau(int i);

    void zzav(boolean z);

    void zzaw(zzm zzm);

    void zzax(boolean z);

    void zzay(boolean z);

    void zzaz(String str, zzbkf zzbkf);

    Activity zzi();

    com.google.android.gms.ads.internal.zza zzj();

    zzbdr zzl();

    VersionInfoParcel zzm();

    zzcgi zzq();

    void zzt(String str, zzcdn zzcdn);
}
