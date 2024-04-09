package com.tour.events.infraestructure.mapper;

import com.tour.events.domain.dto.EventDto;
import com.tour.events.infraestructure.entities.Event;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring")
public interface EventMapper {

    @Mappings({
            @Mapping(source = "id",  target = "id"),
            @Mapping(source = "name",  target = "name"),
            @Mapping(source = "description",  target = "description"),
            @Mapping(source = "location",  target = "location"),
            @Mapping(source = "start",  target = "start"),
            @Mapping(source = "finish",  target = "finish"),
            @Mapping(source = "ageRestriction",  target = "ageRestriction"),
            @Mapping(source = "capacity",  target = "capacity"),
            @Mapping(source = "type",  target = "type"),
            @Mapping(source = "city",  target = "city"),
            @Mapping(source = "address",  target = "address"),
            @Mapping(source = "createdAt",  target = "createdAt"),
            @Mapping(source = "updatedAt",  target = "updatedAt"),
    })
    EventDto toEventDto(Event event);

    List<EventDto> toEvents(List<Event> events);

    default Optional<EventDto> toEventsOptional(Optional<Event> event){
        return event.map(this::toEventDto);
    }
    @InheritInverseConfiguration
    Event toEvent(EventDto eventDto);

}
