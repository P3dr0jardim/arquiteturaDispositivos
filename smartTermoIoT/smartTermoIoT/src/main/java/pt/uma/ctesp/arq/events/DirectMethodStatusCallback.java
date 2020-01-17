/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uma.ctesp.arq.events;

import com.microsoft.azure.sdk.iot.device.IotHubEventCallback;
import com.microsoft.azure.sdk.iot.device.IotHubStatusCode;

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
public class DirectMethodStatusCallback implements IotHubEventCallback{

    // The device connection string to authenticate the device with your IoT hub.
  // Using the Azure CLI:
  // az iot hub device-identity show-connection-string --hub-name {YourIoTHubName} --device-id MyJavaDevice --output table
  private static String connString = "{Your device connection string here}";

  // Using the MQTT protocol to connect to IoT Hub
  private static IotHubClientProtocol protocol = IotHubClientProtocol.MQTT;
  private static DeviceClient client;

  // Define method response codes
  private static final int METHOD_SUCCESS = 200;
  private static final int METHOD_NOT_DEFINED = 404;
  private static final int INVALID_PARAMETER = 400;

  private static int telemetryInterval = 1000;
    @Override
    public void execute(IotHubStatusCode status, Object context)
    {
      System.out.println("Direct method # IoT Hub responded to device method acknowledgement with status: " + status.name());
    }
    
}
