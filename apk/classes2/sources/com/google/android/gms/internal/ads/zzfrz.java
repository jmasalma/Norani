package com.google.android.gms.internal.ads;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public abstract class zzfrz implements SensorEventListener {
    protected zzfrz(String str, String str2) {
        zzfry.zza();
        zzfrx.zza();
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        zza(sensorEvent);
    }

    public abstract void zza(SensorEvent sensorEvent);
}
