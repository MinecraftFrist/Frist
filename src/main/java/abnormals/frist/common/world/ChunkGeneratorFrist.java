package abnormals.frist.common.world;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.IChunkGenerator;

import javax.annotation.Nullable;
import java.util.List;

public class ChunkGeneratorFrist implements IChunkGenerator {
    World world;
    Biome[] biomeBufferArray;

    public ChunkGeneratorFrist(World world){
        this.world=world;
    }

    @Override
    public Chunk generateChunk(int x, int z) {
        int globalCoordX = x<<4;
        int globalCoordZ = z<<4;
        Chunk chunk =  new Chunk(world,x,z);
        this.biomeBufferArray =world.getBiomeProvider().getBiomes(this.biomeBufferArray,globalCoordX,globalCoordZ,16,16);
        byte[] chunkBiomeByteArray = chunk.getBiomeArray();
        for(int i = 0; i<chunkBiomeByteArray.length;i++){
            chunkBiomeByteArray[i] =(byte)Biome.getIdForBiome(biomeBufferArray[i]);
        }
        return chunk;
    }

    @Override
    public void populate(int x, int z) {

    }

    @Override
    public boolean generateStructures(Chunk chunkIn, int x, int z) {
        return false;
    }

    @Override
    public List<Biome.SpawnListEntry> getPossibleCreatures(EnumCreatureType creatureType, BlockPos pos) {
        return null;
    }

    @Nullable
    @Override
    public BlockPos getNearestStructurePos(World worldIn, String structureName, BlockPos position, boolean findUnexplored) {
        return null;
    }

    @Override
    public void recreateStructures(Chunk chunkIn, int x, int z) {

    }

    @Override
    public boolean isInsideStructure(World worldIn, String structureName, BlockPos pos) {
        return false;
    }
}
