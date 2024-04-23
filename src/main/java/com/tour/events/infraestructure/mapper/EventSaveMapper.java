package com.tour.events.infraestructure.mapper;

import com.tour.events.domain.dto.EventSaveDto;
import com.tour.events.infraestructure.entities.Event;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring")
public interface EventSaveMapper {

    @Mappings({
            @Mapping(source = "id",  target = "idDto"),
            @Mapping(source = "name",  target = "nameDto"),
            @Mapping(source = "description",  target = "descriptionDto"),
            @Mapping(source = "location",  target = "locationDto"),
            @Mapping(source = "start",  target = "startDto"),
            @Mapping(source = "finish",  target = "finishDto"),
            @Mapping(source = "ageRestriction",  target = "ageRestrictionDto"),
            @Mapping(source = "capacity",  target = "capacityDto"),
            @Mapping(source = "availability", target = "availabilityDto"),
            @Mapping(source = "type",  target = "typeDto"),
            @Mapping(source = "city",  target = "cityDto"),
            @Mapping(source = "address",  target = "addressDto"),
//            @Mapping(source = "createdAt",  target = "createdAtDto"),
//            @Mapping(source = "updatedAt",  target = "updatedAtDto"),
    })
    EventSaveDto toEventSaveDto(Event event);

//    List<EventSaveDto> toEventsSaveDto(List<Event> events);

    default Optional<EventSaveDto> toEventsDtoOptional(Optional<Event> event){
        return event.map(this::toEventSaveDto);
    }
    @InheritInverseConfiguration
//    @Mapping(target = "description",ignore = true)
//    @Mapping(target = "ageRestriction",ignore = true)
//    @Mapping(target = "capacity",ignore = true)
//    @Mapping(target = "type",ignore = true)
//    @Mapping(target = "city",ignore = true)
//    @Mapping(target = "address",ignore = true)
//    @Mapping(target = "createdAt",ignore = true)
//    @Mapping(target = "updatedAt",ignore = true)
    Event toEvent(EventSaveDto eventSaveDto);
}
