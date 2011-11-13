/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.mobicents.protocols.ss7.cap.api.service.circuitSwitchedCall.primitive;

import org.mobicents.protocols.ss7.isup.message.parameter.CalledPartyNumber;
import org.mobicents.protocols.ss7.map.api.primitives.IMEI;
import org.mobicents.protocols.ss7.map.api.primitives.ISDNAddressString;
import org.mobicents.protocols.ss7.map.api.service.callhandling.UUData;
import org.mobicents.protocols.ss7.map.api.service.subscriberInformation.MSClassmark2;
import org.mobicents.protocols.ss7.map.api.service.subscriberManagement.ExtBasicServiceCode;
import org.mobicents.protocols.ss7.map.api.service.subscriberManagement.OfferedCamel4Functionalities;
import org.mobicents.protocols.ss7.map.api.service.subscriberManagement.SupportedCamelPhases;

/**
*
InitialDPArgExtension {PARAMETERS-BOUND : bound} ::= SEQUENCE { 
 gmscAddress       [0] ISDN-AddressString      OPTIONAL, 
 forwardingDestinationNumber   [1] CalledPartyNumber {bound}    OPTIONAL, 
 ms-Classmark2      [2] MS-Classmark2       OPTIONAL, 
 iMEI        [3] IMEI         OPTIONAL, 
 supportedCamelPhases    [4] SupportedCamelPhases     OPTIONAL, 
 offeredCamel4Functionalities   [5] OfferedCamel4Functionalities   OPTIONAL, 
 bearerCapability2     [6] BearerCapability {bound}    OPTIONAL, 
 ext-basicServiceCode2    [7] Ext-BasicServiceCode     OPTIONAL, 
 highLayerCompatibility2    [8] HighLayerCompatibility     OPTIONAL, 
 lowLayerCompatibility    [9] LowLayerCompatibility {bound}   OPTIONAL, 
 lowLayerCompatibility2    [10] LowLayerCompatibility {bound}   OPTIONAL, 
 ..., 
 enhancedDialledServicesAllowed  [11] NULL         OPTIONAL, 
 uu-Data        [12] UU-Data        OPTIONAL
 
} 
* 
* @author sergey vetyutnev
* 
*/
public interface InitialDPArgExtension {

	public ISDNAddressString getGmscAddress();

	public byte[] getForwardingDestinationNumber();

	public CalledPartyNumber getForwardingDestinationNumberIsup();

	public MSClassmark2 getMSClassmark2();

	public IMEI getIMEI();

	public SupportedCamelPhases getSupportedCamelPhases();

	public OfferedCamel4Functionalities getOfferedCamel4Functionalities();

	public BearerCapability getBearerCapability2();

	public ExtBasicServiceCode getExtBasicServiceCode2();

	public byte[] getHighLayerCompatibility2(); // TODO: ISUP version

	public byte[] getLowLayerCompatibility(); // TODO: ISUP version

	public byte[] getLowLayerCompatibility2(); // TODO: ISUP version

	public boolean getEnhancedDialledServicesAllowed();

	public UUData getUUData();

}