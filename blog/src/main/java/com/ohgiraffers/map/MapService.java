package com.ohgiraffers.semi_project;

public class MapService{
    private final Repository repository;

    @Autowired
    public MapService(Repository repository){
        this.repository = repository;
    }

    // mapDTO를 이용하여 map 생성
    public Map createMap(MapDTO dto) {
        Map map = new Map();
        map.setPlaceName(dto.getPlaceName());
        map.setStartDate(dto.getStartDate());
        map.setEndDate(dto.getEndDate());
        return Repository.save(map);
    }

    // 모든 map 조회
    public List<MapDTO> getAllmap() {
        List<Map> map = Repository.findAll();
        return maps.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }



    // Map 엔티티를 DTO로 변환
    private Map convertToDTO(Map map) {
       MapDTO dto = new MapDTO();
        dto.setPlaceName(map.getPlaceName());
        dto.setStartDate(map.getStartDate());
        dto.setEndDate(map.getEndDate());
        return dto;
    }
}