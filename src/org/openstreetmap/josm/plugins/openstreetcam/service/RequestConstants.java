/*
 *  Copyright 2016 Telenav, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package org.openstreetmap.josm.plugins.openstreetcam.service;


/**
 * Holds paramters and method names.
 *
 * @author Beata
 * @version $Revision$
 */
final class RequestConstants {

    static final String LIST_NEARBY_PHOTOS = "/list/nearby-photos/";
    static final String SEQUENCE_PHOTO_LIST = "/sequence/photo-list/";
    static final String LIST_MATCHED_TRACKS = "tracks";
    static final String COORDINATE = "coordinate";
    static final String RADIUS = "radius";
    static final String PAGE = "page";
    static final String PAGE_ITEMS = "ipp";
    static final String DATE = "date";
    static final String ID = "sequenceId";
    static final String BBOX_TOP_LEFT = "bbTopLeft";
    static final String BBOX_BOTTOM_RIGHT = "bbBottomRight";
    static final String ZOOM = "zoom";
    static final String MY_TRACKS = "myTracks";
    static final String MY_TRACKS_VAL = "true";
    static final String USER_TYPE = "filterUserType";
    static final String USER_TYPE_OSM = "osm";
    static final String EXTERNAL_USER_ID = "filterExternalUserId";

    static final String USER_AGENT = "User-Agent";

    private RequestConstants() {}
}