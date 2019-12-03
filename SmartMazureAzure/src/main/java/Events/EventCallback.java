/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Events;

import com.microsoft.azure.sdk.iot.device.IotHubEventCallback;
import com.microsoft.azure.sdk.iot.device.IotHubStatusCode;

/**
 *
 * @author Turma A
 */

    public class EventCallback implements IotHubEventCallback {
    public void execute(IotHubStatusCode status, Object context) {
      System.out.println("IoT Hub responded to message with status: " + status.name());

      if (context != null) {
        synchronized (context) {
          context.notify();
        }
      }
    }
  }
    

