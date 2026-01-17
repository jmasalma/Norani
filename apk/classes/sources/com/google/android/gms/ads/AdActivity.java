package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbtq;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class AdActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    private zzbtq zza;

    private final void zza() {
        zzbtq zzbtq = this.zza;
        if (zzbtq != null) {
            try {
                zzbtq.zzx();
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        try {
            zzbtq zzbtq = this.zza;
            if (zzbtq != null) {
                zzbtq.zzh(i, i2, intent);
            }
        } catch (Exception e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void onBackPressed() {
        try {
            zzbtq zzbtq = this.zza;
            if (zzbtq != null && !zzbtq.zzH()) {
                return;
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            zzbtq zzbtq2 = this.zza;
            if (zzbtq2 != null) {
                zzbtq2.zzi();
            }
        } catch (RemoteException e2) {
            zzo.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbtq zzbtq = this.zza;
            if (zzbtq != null) {
                zzbtq.zzk(ObjectWrapper.wrap(configuration));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzo.zze("AdActivity onCreate");
        zzbtq zzq = zzbb.zza().zzq(this);
        this.zza = zzq;
        if (zzq != null) {
            try {
                zzq.zzl(bundle);
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
                finish();
            }
        } else {
            zzo.zzl("#007 Could not call remote method.", (Throwable) null);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        zzo.zze("AdActivity onDestroy");
        try {
            zzbtq zzbtq = this.zza;
            if (zzbtq != null) {
                zzbtq.zzm();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        zzo.zze("AdActivity onPause");
        try {
            zzbtq zzbtq = this.zza;
            if (zzbtq != null) {
                zzbtq.zzo();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            zzbtq zzbtq = this.zza;
            if (zzbtq != null) {
                zzbtq.zzp(i, strArr, iArr);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    /* access modifiers changed from: protected */
    public final void onRestart() {
        super.onRestart();
        zzo.zze("AdActivity onRestart");
        try {
            zzbtq zzbtq = this.zza;
            if (zzbtq != null) {
                zzbtq.zzq();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        zzo.zze("AdActivity onResume");
        super.onResume();
        try {
            zzbtq zzbtq = this.zza;
            if (zzbtq != null) {
                zzbtq.zzr();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            zzbtq zzbtq = this.zza;
            if (zzbtq != null) {
                zzbtq.zzs(bundle);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        zzo.zze("AdActivity onStart");
        try {
            zzbtq zzbtq = this.zza;
            if (zzbtq != null) {
                zzbtq.zzt();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        zzo.zze("AdActivity onStop");
        try {
            zzbtq zzbtq = this.zza;
            if (zzbtq != null) {
                zzbtq.zzu();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbtq zzbtq = this.zza;
            if (zzbtq != null) {
                zzbtq.zzv();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void setContentView(int i) {
        super.setContentView(i);
        zza();
    }

    public final void setContentView(View view) {
        super.setContentView(view);
        zza();
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zza();
    }
}
