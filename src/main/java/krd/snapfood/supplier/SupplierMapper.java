package krd.snapfood.supplier;

import org.geolatte.geom.G2D;
import org.geolatte.geom.Geometries;
import org.geolatte.geom.Point;
import org.geolatte.geom.crs.CoordinateReferenceSystems;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;
import java.util.List;

@Mapper(componentModel = "spring")
public interface SupplierMapper {

    @Mappings({
            @Mapping(source = "location",target = "location",qualifiedByName = "LocationDtoToLocation")
    })

    Supplier toSupplier(SupplierDTO supplierDTO);

    @Mappings({
            @Mapping(source = "location",target = "location",qualifiedByName = "locationToLocationDTO")
    })
    SupplierDTO toSupplierDTO(Supplier supplier);

    List<Supplier> toSupplierList(List<SupplierDTO> supplierDTOS);
    List<SupplierDTO> toSupplierDTO(List<Supplier> suppliers);


    @Named("LocationDtoToLocation")
    default Point<G2D> convertLocationDtoToLocation(LocationDTO locationDTO) {
        return Geometries.mkPoint(new G2D(locationDTO.getLng(), locationDTO.getLat()), CoordinateReferenceSystems.WGS84);
    }

    @Named("locationToLocationDTO")
    default LocationDTO convertLocationToLocationDTO(Point<G2D> point) {
        G2D g2D=point.getPosition();
        LocationDTO locationDTO=new LocationDTO();
        locationDTO.setLat(g2D.getLat());
        locationDTO.setLng(g2D.getLon());
        return locationDTO;
    }

}