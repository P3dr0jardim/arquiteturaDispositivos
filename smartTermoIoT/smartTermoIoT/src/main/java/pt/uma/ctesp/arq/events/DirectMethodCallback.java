/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uma.ctesp.arq.events;

import com.microsoft.azure.sdk.iot.device.*;
import com.microsoft.azure.sdk.iot.device.DeviceTwin.*;
import com.google.gson.Gson;

import java.io.*;
import java.net.URISyntaxException;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
/**
 *
 * @author Turma A
 */
public class DirectMethodCallback implements DeviceMethodCallback{
    // Define method response codes
  private static final int METHOD_SUCCESS = 200;
  private static final int METHOD_NOT_DEFINED = 404;
  private static final int INVALID_PARAMETER = 400;

  private static int telemetryInterval = 1000;
    private void setTelemetryInterval(int interval)
    {
      System.out.println("Direct method # Setting telemetry interval (seconds): " + interval);
      telemetryInterval = interval * 1000;
    }

    @Override
    public DeviceMethodData call(String methodName, Object methodData, Object context)
    {
      DeviceMethodData deviceMethodData;
      String payload = new String((byte[])methodData);
      switch (methodName)
      {
        case "SetTelemetryInterval" :
        {
          int interval;
          try {
            int status = METHOD_SUCCESS;
            interval = Integer.parseInt(payload);
            System.out.println(payload);
            setTelemetryInterval(interval);
            deviceMethodData = new DeviceMethodData(status, "Executed direct method " + methodName);
          } catch (NumberFormatException e) {
            int status = INVALID_PARAMETER;
            deviceMethodData = new DeviceMethodData(status, "Invalid parameter " + payload);
          }
          break;
        }
        default:
        {
          int status = METHOD_NOT_DEFINED;
          deviceMethodData = new DeviceMethodData(status, "Not defined direct method " + methodName);
        }
      }
      return deviceMethodData;
      }
}
