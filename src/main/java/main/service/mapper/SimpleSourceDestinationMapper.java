package main.service.mapper;

import main.domain.SimpleDTO;
import main.domain.SimpleSource;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SimpleSourceDestinationMapper {

    SimpleDTO sourceToDestination(SimpleSource simpleSource);

    SimpleSource destinationToSource(SimpleDTO simpleDTO);
}
