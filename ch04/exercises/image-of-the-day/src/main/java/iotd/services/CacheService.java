package iotd.services;

import iotd.models.Image;

public interface CacheService {
    Image getImage();
    void putImage(Image img);
}
